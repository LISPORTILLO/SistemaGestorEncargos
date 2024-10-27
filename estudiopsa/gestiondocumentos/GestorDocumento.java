package estudiopsa.gestiondocumentos;

import java.util.ArrayList;

public class GestorDocumento {

    // Lista que almacena documentos de tipo Documento
    private ArrayList<Documento> documentos = new ArrayList<>();

    // Método para clasificar un documento según su tipo
    public void clasificarDocumento(Documento documento) {
        // Verifica si el tipo de documento es "contable" o "jurídico"
        if (documento.getTipo().equalsIgnoreCase("contable") || documento.getTipo().equalsIgnoreCase("jurídico")) {
            System.out.println("Documento clasificado como: " + documento.getTipo());
        } else {
            // Mensaje si el tipo de documento no está clasificado
            System.out.println("Tipo de documento no clasificado.");
        }
    }

    // Método para obtener un documento por su ID
    public Documento obtenerDocumento(Integer id) {
        // Itera sobre la lista de documentos para encontrar el que coincida con el ID
        for (Documento doc : documentos) {
            if (doc.getIdDocumento().equals(id)) {
                return doc; // Retorna el documento encontrado
            }
        }
        return null; // Retorna null si no se encuentra el documento
    }

    // Método para actualizar un documento existente
    public void actualizarDocumento(Documento documento) {
        // Itera sobre la lista de documentos para encontrar el que se quiere actualizar
        for (int i = 0; i < documentos.size(); i++) {
            if (documentos.get(i).getIdDocumento().equals(documento.getIdDocumento())) {
                documentos.set(i, documento); // Reemplaza el documento existente con el nuevo
                return; // Termina el método tras la actualización
            }
        }
        // Muestra un mensaje de error si el documento no se encuentra
        documento.mostrarMensajeError();
    }

    // Método para cargar un nuevo documento en la lista
    public void cargarDocumento(Documento documento) {
        documentos.add(documento); // Añade el documento a la lista
    }
}
