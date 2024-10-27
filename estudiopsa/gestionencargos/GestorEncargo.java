package estudiopsa.gestionencargos;

import estudiopsa.gestionencargos.Encargo;
import java.util.ArrayList;

public class GestorEncargo {

    // Lista que almacena los encargos registrados
    private ArrayList<Encargo> encargos = new ArrayList<>();

    // Método para registrar un nuevo encargo
    public void registrarEncargo(Encargo encargo) {
        encargos.add(encargo); // Añade el encargo a la lista
    }

    // Método para modificar un encargo existente
    public void modificarEncargo(Encargo encargo) {
        for (int i = 0; i < encargos.size(); i++) {
            // Verifica si el ID del encargo coincide con uno existente
            if (encargos.get(i).getIdEncargo().equals(encargo.getIdEncargo())) {
                encargos.set(i, encargo); // Reemplaza el encargo existente
                return; // Sale del método una vez modificado
            }
        }
        // Muestra un mensaje de error si el encargo no se encuentra
        encargo.mostrarMensajeError();
    }

    // Método para cerrar un encargo por su ID
    public void cerrarEncargo(Integer id) {
        for (int i = 0; i < encargos.size(); i++) {
            // Busca el encargo con el ID proporcionado
            if (encargos.get(i).getIdEncargo().equals(id)) {
                encargos.get(i).setEstado("Finalizado"); // Cambia el estado a "Finalizado"
                System.out.println("Encargo finalizado correctamente."); // Mensaje de éxito
                return; // Sale del método después de cerrar el encargo
            }
        }
        System.out.println("Encargo no encontrado."); // Mensaje si el encargo no existe
    }

    // Método para obtener un encargo por su ID
    public Encargo obtenerEncargo(Integer id) {
        for (Encargo enc : encargos) {
            // Verifica si el ID del encargo coincide
            if (enc.getIdEncargo().equals(id)) {
                return enc; // Retorna el encargo encontrado
            }
        }
        return null; // Retorna null si no se encuentra el encargo
    }
}
