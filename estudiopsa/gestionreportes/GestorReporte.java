package estudiopsa.gestionreportes;

import estudiopsa.gestionreportes.Reporte;
import java.util.ArrayList;

public class GestorReporte {

    // Lista que almacena los reportes generados
    private ArrayList<Reporte> reportes = new ArrayList<>();

    // Método para generar un nuevo reporte
    public void generarReporte(Reporte reporte) {
        // Verifica si el reporte es válido antes de agregarlo
        if (reporte.validarReporte()) {
            reportes.add(reporte); // Agrega el reporte a la lista
        } else {
            // Muestra un mensaje de error si el reporte no es válido
            reporte.mostrarMensajeError();
        }
    }

    // Método para obtener un reporte por su ID
    public Reporte obtenerReporte(Integer id) {
        // Recorre la lista de reportes para encontrar el que coincida con el ID
        for (Reporte rep : reportes) {
            if (rep.getIdReporte().equals(id)) {
                return rep; // Retorna el reporte encontrado
            }
        }
        return null; // Retorna null si no se encuentra el reporte
    }

    // Método para eliminar un reporte por su ID
    public void eliminarReporte(Integer id) {
        // Busca el reporte en la lista y lo elimina si lo encuentra
        for (int i = 0; i < reportes.size(); i++) {
            if (reportes.get(i).getIdReporte().equals(id)) {
                reportes.remove(i); // Elimina el reporte
                System.out.println("Reporte eliminado correctamente.");
                return; // Sale del método después de eliminar
            }
        }
        // Mensaje si el reporte no se encuentra
        System.out.println("Reporte no encontrado.");
    }
}
