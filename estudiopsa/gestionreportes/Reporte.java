package estudiopsa.gestionreportes;

public class Reporte {

    private Integer idReporte; // Identificador único del reporte
    private String tipo; // Tipo de reporte
    private String fechaGeneracion; // Fecha en la que se genera el reporte
    private String datos; // Datos relacionados con el reporte

    // Constructor de la clase Reporte que inicializa sus atributos
    public Reporte(Integer idReporte, String tipo, String fechaGeneracion, String datos) {
        this.idReporte = idReporte;
        this.tipo = tipo;
        this.fechaGeneracion = fechaGeneracion;
        this.datos = datos;
    }

    // Getters y Setters del reporte
    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    // Método que valida si el reporte tiene tipo y datos válidos
    public boolean validarReporte() {
        return (tipo != null && !tipo.isEmpty() && datos != null && !datos.isEmpty());
    }

    // Método que muestra un formulario con la información del reporte
    public void mostrarFormulario() {
        System.out.println("Formulario de Reporte:");
        System.out.println("ID Reporte: " + idReporte);
        System.out.println("Tipo: " + tipo);
        System.out.println("Fecha Generación: " + fechaGeneracion);
        System.out.println("Datos: " + datos);
    }

    // Método que muestra un mensaje de error si el reporte no se generó
    public void mostrarMensajeError() {
        System.out.println("Error: Reporte no generado.");
    }

    // Método que muestra una confirmación de que el reporte se generó correctamente
    public void mostrarConfirmacion() {
        System.out.println("Reporte generado correctamente.");
    }
}
