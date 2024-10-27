package estudiopsa.gestionusuarios;

public class Usuario {

    private Integer idUsuario;  // Identificador único del usuario
    private String nombre;      // Nombre del usuario
    private String correo;      // Correo electrónico del usuario
    private String contraseña;  // Contraseña del usuario
    private String rol;         // Rol del usuario (ej. administrador, usuario regular)

    // Constructor que inicializa los atributos del usuario
    public Usuario(Integer idUsuario, String nombre, String correo, String contraseña, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Getters y Setters del usuario
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Método para validar el inicio de sesión del usuario comparando correo y contraseña
    public boolean validarInicio(String correo, String contraseña) {
        return (this.correo.equals(correo) && this.contraseña.equals(contraseña));
    }

    // Método para mostrar un mensaje de error en caso de que el usuario no sea encontrado
    public void mostrarMensajeError() {
        System.out.println("Error: Usuario no encontrado o datos incorrectos.");
    }

    // Método para mostrar un mensaje de confirmación cuando el usuario se registra correctamente
    public void mostrarConfirmacion() {
        System.out.println("Usuario registrado correctamente.");
    }
}
