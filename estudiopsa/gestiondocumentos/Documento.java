package estudiopsa.gestiondocumentos;

public class Documento {

    private Integer idDocumento; // Identificador único del documento
    private String tipo; // Tipo de documento (ej. factura, contrato)
    private String etiqueta; // Etiqueta asociada al documento
    private String cliente; // Nombre del cliente asociado al documento
    private Integer idEncargo; // Identificador del encargo relacionado con el documento

    // Constructor para inicializar un nuevo Documento con los parámetros proporcionados
    public Documento(Integer idDocumento, String tipo, String etiqueta, String cliente, Integer idEncargo) {
        this.idDocumento = idDocumento;
        this.tipo = tipo;
        this.etiqueta = etiqueta;
        this.cliente = cliente;
        this.idEncargo = idEncargo;
    }

    // Método para mostrar el formulario del documento
    public void mostrarFormulario() {
        System.out.println("Formulario de Documento:");
        System.out.println("ID Documento: " + idDocumento);
        System.out.println("Tipo: " + tipo);
        System.out.println("Etiqueta: " + etiqueta);
        System.out.println("Cliente: " + cliente);
    }

    // Método para mostrar un mensaje de error
    public void mostrarMensajeError() {
        System.out.println("Error: Documento no encontrado o datos incorrectos.");
    }

    // Método para mostrar un mensaje de confirmación al registrar un documento
    public void mostrarConfirmacion() {
        System.out.println("Documento registrado correctamente.");
    }

    // Getters y Setters del documento
    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getIdEncargo() {
        return idEncargo;
    }

    public void setIdEncargo(Integer idEncargo) {
        this.idEncargo = idEncargo;
    }
}
