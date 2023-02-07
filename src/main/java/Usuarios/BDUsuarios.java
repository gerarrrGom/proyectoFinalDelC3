package Usuarios;
import GestionDeProfesores.Profesor;
import ResumenActividades.Archivo;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Adrian Rubio
 * rubioalvaradoadrian@gmail.com
 */
public class BDUsuarios {

    public LinkedList<Usuario> obtener() {
        LinkedList<Usuario> administradores = null;
        Archivo archivo = new Archivo("usuarios.txt");
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            administradores = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                String nombre = tokens.nextToken();
                String apellidoPaterno = tokens.nextToken();
                String apellidoMaterno = tokens.nextToken();
                String gradoAcademico = tokens.nextToken();
                String cursosImpartidos = tokens.nextToken();
                String contraseña = tokens.nextToken();
                String usuario = tokens.nextToken();
                Profesor p = new Profesor(nombre, apellidoPaterno, apellidoMaterno, gradoAcademico, cursosImpartidos, contraseña, usuario);
                int permiso = Integer.parseInt(tokens.nextToken());
                Usuario n = new Usuario(p, permiso);
                administradores.add(n);
            }
        }
        return administradores;
    }

    public boolean registrarUsuario(Usuario a) {
        Archivo archivo = new Archivo("usuarios.txt");
        return archivo.registrar(a.getDatos().getNombre() + ";"
                + a.getDatos().getApellidoPaterno() + ";"
                + a.getDatos().getApellidoMaterno() + ";"
                + a.getDatos().getGradoAcademico() + ";"
                + a.getDatos().getCursosImpartidos() + ";"
                + a.getDatos().getContraseña() + ";"
                + a.getDatos().getUsuario() + ";"
                + a.getPermisos() + ";");
    }

    public void borrar() {
        Archivo archivo = new Archivo("usuarios.txt");
        archivo.borrarContenido();
    }
}