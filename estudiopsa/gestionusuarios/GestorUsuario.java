package estudiopsa.gestionusuarios;

import estudiopsa.gestionusuarios.Usuario;
import java.util.ArrayList;

public class GestorUsuario {
    private ArrayList<Usuario> usuarios = new ArrayList<>(); // Lista que almacena los usuarios registrados.

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario); // Agrega un nuevo usuario a la lista.
    }

    public void modificarUsuario(Usuario usuario) {
        // Busca un usuario en la lista por su ID y lo reemplaza si existe.
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getIdUsuario().equals(usuario.getIdUsuario())) {
                usuarios.set(i, usuario); // Modifica el usuario existente.
                return; // Sale del método una vez que se ha modificado.
            }
        }
        usuario.mostrarMensajeError(); // Muestra un mensaje de error si el usuario no se encuentra.
    }

    public void eliminarUsuario(Integer id) {
        // Busca y elimina un usuario por su ID.
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getIdUsuario().equals(id)) {
                usuarios.remove(i); // Elimina el usuario de la lista.
                System.out.println("Usuario eliminado correctamente."); // Mensaje de éxito.
                return; // Sale del método después de la eliminación.
            }
        }
        System.out.println("Usuario no encontrado."); // Mensaje si el usuario no se encuentra.
    }

    public void iniciarSesion(String correo, String contraseña) {
        // Verifica si el usuario existe y si las credenciales son correctas.
        for (Usuario usuario : usuarios) {
            if (usuario.validarInicio(correo, contraseña)) {
                System.out.println("Inicio de sesión exitoso."); // Mensaje de éxito.
                return; // Sale del método tras un inicio exitoso.
            }
        }
        System.out.println("Error: Usuario no encontrado o datos incorrectos."); // Mensaje de error.
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada."); // Mensaje de cierre de sesión.
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios; // Devuelve la lista de usuarios.
    }
}
