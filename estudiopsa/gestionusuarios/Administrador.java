package estudiopsa.gestionusuarios;

import estudiopsa.gestionusuarios.Usuario;
import estudiopsa.gestionusuarios.GestorUsuario;

public class Administrador extends Usuario { // La clase Administrador hereda de la clase Usuario

    public Administrador(Integer idUsuario, String nombre, String correo, String contraseña, String rol) {
        super(idUsuario, nombre, correo, contraseña, rol); // Llama al constructor de la clase padre Usuario
    }

    public void registrarUsuario(Usuario usuario) {
        GestorUsuario gestor = new GestorUsuario(); // Crea una instancia de GestorUsuario para manejar el registro
        gestor.registrarUsuario(usuario); // Llama al método para registrar un nuevo usuario
    }

    public void modificarUsuario(Usuario usuario) {
        GestorUsuario gestor = new GestorUsuario(); // Crea una instancia de GestorUsuario para manejar la modificación
        gestor.modificarUsuario(usuario); // Llama al método para modificar los datos de un usuario existente
    }

    public void eliminarUsuario(Integer id) {
        GestorUsuario gestor = new GestorUsuario(); // Crea una instancia de GestorUsuario para manejar la eliminación
        gestor.eliminarUsuario(id); // Llama al método para eliminar un usuario por su ID
    }
}
