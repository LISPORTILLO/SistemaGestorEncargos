package estudiopsa.gestionencargos;

public class Encargo {

    private Integer idEncargo;  // Identificador único del encargo
    private String fecha;        // Fecha asociada al encargo
    private String descripcion;  // Descripción del encargo
    private String prioridad;     // Prioridad del encargo (urgente o común)
    private String estado;        // Estado actual del encargo
    private Integer idDocumento;  // ID del documento relacionado con el encargo

    // Constructor para inicializar los atributos del encargo
    public Encargo(Integer idEncargo, String fecha, String descripcion, String prioridad, String estado, Integer idDocumento) {
        this.idEncargo = idEncargo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.idDocumento = idDocumento;
    }

    // Getters y Setter del encargo
    public Integer getIdEncargo() {
        return idEncargo;
    }

    public void setIdEncargo(Integer idEncargo) {
        this.idEncargo = idEncargo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    // Método para mostrar el formulario con los detalles del encargo
    public void mostrarFormulario() {
        System.out.println("Formulario de Encargo:");
        System.out.println("ID Encargo: " + idEncargo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Estado: " + estado);
    }

    // Método para mostrar un mensaje de error en caso de que el encargo no sea encontrado
    public void mostrarMensajeError() {
        System.out.println("Error: Encargo no encontrado o datos incorrectos.");
    }

    // Método para mostrar una confirmación de registro exitoso del encargo
    public void mostrarConfirmacion() {
        System.out.println("Encargo registrado correctamente.");
    }
}
