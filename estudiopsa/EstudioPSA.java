package estudiopsa;

import estudiopsa.gestiondocumentos.Documento;
import estudiopsa.gestiondocumentos.GestorDocumento;
import estudiopsa.gestionencargos.GestorEncargo;
import estudiopsa.gestionencargos.Encargo;
import estudiopsa.gestionreportes.GestorReporte;
import estudiopsa.gestionreportes.Reporte;
import estudiopsa.gestionusuarios.GestorUsuario;
import estudiopsa.gestionusuarios.Profesional;
import estudiopsa.gestionusuarios.Usuario;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudioPSA {

    public static void main(String[] args) {
        // Se crean instancias de los gestores responsables de manejar documentos, reportes, encargos y usuarios
        GestorDocumento gestorDocumento = new GestorDocumento();
        GestorReporte gestorReporte = new GestorReporte();
        GestorEncargo gestorEncargo = new GestorEncargo();
        GestorUsuario gestorUsuario = new GestorUsuario();

        // Se crean instancias de usuarios, incluyendo un usuario administrador y dos profesionales
        Usuario usuario1 = new Usuario(1, "Lisandro Portillo", "lisandrop@gmail.com", "contra1", "Administrador");
        Usuario usuario2 = new Profesional(2, "Ramiro Gonzalez", "ramirog@gmail.com", "contra2", "Profesional", "Abogada");
        Usuario usuario3 = new Profesional(3, "Juana Didier", "juanad@gmail.com", "contra3", "Profesional", "Contador");

        // Se registran los usuarios creados en el gestor de usuarios
        gestorUsuario.registrarUsuario(usuario1);
        gestorUsuario.registrarUsuario(usuario2);
        gestorUsuario.registrarUsuario(usuario3);

        // Se crean instancias de documentos
        Documento documento1 = new Documento(1, "Contrato", "Compraventa casa", "Valeria Ramirez", 1);
        Documento documento2 = new Documento(2, "Balance Contable", "Balance junio SOL", "Empresa SOL SA", 2);

        // Se cargan los documentos en el gestor de documentos
        gestorDocumento.cargarDocumento(documento1);
        gestorDocumento.cargarDocumento(documento2);

        // Se crean instancias de encargos
        Encargo encargo1 = new Encargo(1, "2024-05-04", "Balance contable de empresa SOL", "Común", "Pendiente", 1);
        Encargo encargo2 = new Encargo(2, "2024-02-07", "Contrato de Compraventa de Vivienda", "Urgente", "Pendiente", 2);

        // Se registran los encargos en el gestor de encargos
        gestorEncargo.registrarEncargo(encargo1);
        gestorEncargo.registrarEncargo(encargo2);

        // Se crean instancias de reportes
        Reporte reporte1 = new Reporte(1, "Reporte de modificación de precio en contrato compraventa", "2024-03-02", "Hay que actualizar precio");
        Reporte reporte2 = new Reporte(2, "Reporte de balance contable empresa SOL", "2024-05-05", "Controlar el balance contable, y si está bien cerrarlo");

        // Se generan los reportes en el gestor de reportes
        gestorReporte.generarReporte(reporte1);
        gestorReporte.generarReporte(reporte2);

        // Se crea un escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                // Muestra un menú principal y captura la opción elegida
                System.out.println("Menú:");
                System.out.println("1. Iniciar Sesión");
                System.out.println("2. Salir");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        // Captura el correo electrónico y la contraseña del usuario para iniciar sesión
                        System.out.println("Ingrese correo electrónico:");
                        String correo = scanner.next();
                        System.out.println("Ingrese contraseña:");
                        String contraseña = scanner.next();

                        // Llama al método de inicio de sesión del gestor de usuarios
                        gestorUsuario.iniciarSesion(correo, contraseña);

                        int opcion2 = 0;
                        do {
                            try {
                                // Muestra un menú secundario para las opciones disponibles tras iniciar sesión
                                System.out.println("Menú:");
                                System.out.println("1. Usuarios");
                                System.out.println("2. Encargos y Documentos");
                                System.out.println("3. Reportes");
                                System.out.println("4. Cerrar Sesión");
                                opcion2 = scanner.nextInt();

                                switch (opcion2) {
                                    case 1:
                                        int opcion3 = 0;
                                        do {
                                            try {
                                                // Menú para gestionar usuarios (registrar, modificar, eliminar)
                                                System.out.println("1. Registrar usuario");
                                                System.out.println("2. Modificar usuario");
                                                System.out.println("3. Eliminar usuario");
                                                System.out.println("4. Asignar tarea");
                                                System.out.println("5. Volver");
                                                opcion3 = scanner.nextInt();

                                                switch (opcion3) {
                                                    case 1:
                                                        // Captura datos para registrar un nuevo usuario
                                                        System.out.println("Ingrese nombre:");
                                                        String nombre = scanner.next();
                                                        System.out.println("Ingrese correo electrónico:");
                                                        String correoNuevo = scanner.next();
                                                        System.out.println("Ingrese contraseña:");
                                                        String contraseñaNueva = scanner.next();
                                                        System.out.println("Ingrese rol:");
                                                        String rol = scanner.next();

                                                        // Crea y registra un nuevo usuario
                                                        Usuario nuevoUsuario = new Usuario(4, nombre, correoNuevo, contraseñaNueva, rol);
                                                        gestorUsuario.registrarUsuario(nuevoUsuario);
                                                        nuevoUsuario.mostrarConfirmacion();
                                                        break;
                                                    case 2:
                                                        // Captura el ID de usuario y nuevos datos para modificarlo
                                                        System.out.println("Ingrese ID de usuario:");
                                                        Integer idUsuario = scanner.nextInt();
                                                        System.out.println("Ingrese nuevo nombre:");
                                                        String nuevoNombre = scanner.next();
                                                        System.out.println("Ingrese nuevo correo electrónico:");
                                                        String nuevoCorreo = scanner.next();
                                                        System.out.println("Ingrese nueva contraseña:");
                                                        String nuevaContraseña = scanner.next();
                                                        System.out.println("Ingrese nuevo rol:");
                                                        String nuevoRol = scanner.next();

                                                        // Crea un usuario modificado y lo pasa al gestor
                                                        Usuario usuarioModificado = new Usuario(idUsuario, nuevoNombre, nuevoCorreo, nuevaContraseña, nuevoRol);
                                                        gestorUsuario.modificarUsuario(usuarioModificado);
                                                        break;
                                                    case 3:
                                                        // Captura el ID de usuario para eliminarlo
                                                        System.out.println("Ingrese ID de usuario:");
                                                        Integer idUsuarioEliminar = scanner.nextInt();
                                                        gestorUsuario.eliminarUsuario(idUsuarioEliminar);
                                                        break;
                                                    case 4:
                                                        // Captura el ID de usuario y la tarea a asignar
                                                        System.out.println("Ingrese ID de usuario:");
                                                        Integer idUsuarioAsignar = scanner.nextInt();
                                                        System.out.println("Ingrese tarea:");
                                                        String tarea = scanner.next();

                                                        // Asigna la tarea al profesional correspondiente
                                                        for (Usuario usuario : gestorUsuario.getUsuarios()) {
                                                            if (usuario.getIdUsuario().equals(idUsuarioAsignar)) {
                                                                if (usuario instanceof Profesional) {
                                                                    ((Profesional) usuario).asignarTarea(tarea);
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 5:
                                                        // Opción para volver al menú anterior
                                                        break;
                                                    default:
                                                        // Manejo de opción inválida
                                                        System.out.println("Opción inválida. Por favor, elija una opción válida.");
                                                }
                                            } catch (InputMismatchException e) {
                                                // Captura excepciones de entrada no válida
                                                System.out.println("Error: Por favor, ingrese un valor numérico.");
                                                scanner.next();
                                            }
                                        } while (opcion3 != 5);
                                        break;
                                    case 2:
                                        int opcion4 = 0; // Inicializa la variable para la opción del menú
                                        do {
                                            try {
                                                // Muestra el menú de opciones para registrar, modificar, cerrar o obtener encargos
                                                System.out.println("1. Registrar encargo");
                                                System.out.println("2. Modificar encargo");
                                                System.out.println("3. Cerrar encargo");
                                                System.out.println("4. Obtener encargo");
                                                System.out.println("5. Volver");
                                                opcion4 = scanner.nextInt(); // Lee la opción seleccionada por el usuario

                                                switch (opcion4) {
                                                    case 1: // Opción para registrar un nuevo encargo
                                                        System.out.println("Ingrese fecha:");
                                                        String fecha = scanner.next();
                                                        System.out.println("Ingrese descripción:");
                                                        String descripcion = scanner.next();
                                                        System.out.println("Ingrese prioridad:");
                                                        String prioridad = scanner.next();
                                                        System.out.println("Ingrese estado:");
                                                        String estado = scanner.next();
                                                        System.out.println("Ingrese ID de documento:");
                                                        Integer idDocumento = scanner.nextInt();

                                                        // Crea un nuevo objeto Encargo y lo registra
                                                        Encargo nuevoEncargo = new Encargo(3, fecha, descripcion, prioridad, estado, idDocumento);
                                                        gestorEncargo.registrarEncargo(nuevoEncargo);
                                                        nuevoEncargo.mostrarConfirmacion(); // Muestra confirmación del registro
                                                        break;
                                                    case 2: // Opción para modificar un encargo existente
                                                        System.out.println("Ingrese ID de encargo:");
                                                        Integer idEncargo = scanner.nextInt();
                                                        System.out.println("Ingrese nueva fecha:");
                                                        String nuevaFecha = scanner.next();
                                                        System.out.println("Ingrese nueva descripción:");
                                                        String nuevaDescripcion = scanner.next();
                                                        System.out.println("Ingrese nueva prioridad:");
                                                        String nuevaPrioridad = scanner.next();
                                                        System.out.println("Ingrese nuevo estado:");
                                                        String nuevoEstado = scanner.next();
                                                        System.out.println("Ingrese ID del documento asociado:");
                                                        Integer idDocumentoModificado = scanner.nextInt();

                                                        // Crea un objeto Encargo modificado y lo actualiza
                                                        Encargo encargoModificado = new Encargo(idEncargo, nuevaFecha, nuevaDescripcion, nuevaPrioridad, nuevoEstado, idDocumentoModificado);
                                                        gestorEncargo.modificarEncargo(encargoModificado);
                                                        break;
                                                    case 3: // Opción para cerrar un encargo
                                                        System.out.println("Ingrese ID de encargo:");
                                                        Integer idEncargoCerrar = scanner.nextInt(); // Solicita el ID del encargo a cerrar
                                                        gestorEncargo.cerrarEncargo(idEncargoCerrar); // Cierra el encargo
                                                        break;
                                                    case 4: // Opción para obtener un encargo
                                                        System.out.println("Ingrese ID de encargo:");
                                                        Integer idEncargoObtener = scanner.nextInt(); // Solicita el ID del encargo a obtener
                                                        Encargo encargoObtenido = gestorEncargo.obtenerEncargo(idEncargoObtener); // Intenta obtener el encargo
                                                        if (encargoObtenido != null) {
                                                            encargoObtenido.mostrarFormulario(); // Muestra el formulario del encargo obtenido
                                                        } else {
                                                            System.out.println("Encargo no encontrado."); // Mensaje si no se encuentra el encargo
                                                        }
                                                        break;
                                                    case 5: // Opción para volver al menú anterior
                                                        break;
                                                    default:
                                                        System.out.println("Opción inválida. Por favor, elija una opción válida.");
                                                }
                                            } catch (InputMismatchException e) {
                                                // Maneja la excepción si el usuario no ingresa un número
                                                System.out.println("Error: Por favor, ingrese un valor numérico.");
                                                scanner.next(); // Limpia el buffer de entrada
                                            }
                                        } while (opcion4 != 5); // Repite el menú hasta que el usuario elija volver
                                        break;
                                    case 3:
                                        int opcion5 = 0; // Inicializa la variable para la opción del menú de reportes
                                        do {
                                            try {
                                                // Muestra el menú de opciones para generar, obtener o eliminar reportes
                                                System.out.println("1. Generar reporte");
                                                System.out.println("2. Obtener reporte");
                                                System.out.println("3. Eliminar reporte");
                                                System.out.println("4. Volver");
                                                opcion5 = scanner.nextInt(); // Lee la opción seleccionada por el usuario

                                                switch (opcion5) {
                                                    case 1: // Opción para generar un nuevo reporte
                                                        System.out.println("Ingrese tipo de reporte:");
                                                        String tipoReporte = scanner.next();
                                                        System.out.println("Ingrese fecha de generación:");
                                                        String fechaGeneracion = scanner.next();
                                                        System.out.println("Ingrese datos del reporte:");
                                                        String datosReporte = scanner.next();

                                                        // Crea un nuevo objeto Reporte y lo genera
                                                        Reporte nuevoReporte = new Reporte(3, tipoReporte, fechaGeneracion, datosReporte);
                                                        gestorReporte.generarReporte(nuevoReporte);
                                                        nuevoReporte.mostrarConfirmacion(); // Muestra confirmación del reporte generado
                                                        break;
                                                    case 2: // Opción para obtener un reporte existente
                                                        System.out.println("Ingrese ID de reporte:");
                                                        Integer idReporte = scanner.nextInt();
                                                        Reporte reporteObtenido = gestorReporte.obtenerReporte(idReporte);
                                                        if (reporteObtenido != null) {
                                                            reporteObtenido.mostrarFormulario();
                                                        } else {
                                                            System.out.println("Reporte no encontrado.");
                                                        }
                                                        break;
                                                    case 3: // Opción para eliminar un reporte
                                                        System.out.println("Ingrese ID de reporte:");
                                                        Integer idReporteEliminar = scanner.nextInt(); // Solicita el ID del reporte a eliminar
                                                        gestorReporte.eliminarReporte(idReporteEliminar); // Elimina el reporte
                                                        break;
                                                    case 4: // Opción para volver al menú anterior
                                                        break;
                                                    default:
                                                        System.out.println("Opción inválida. Por favor, elija una opción válida.");
                                                }
                                            } catch (InputMismatchException e) {
                                                // Maneja la excepción si el usuario no ingresa un número
                                                System.out.println("Error: Por favor, ingrese un valor numérico.");
                                                scanner.next(); // Limpia el buffer de entrada
                                            }
                                        } while (opcion5 != 4); // Repite el menú hasta que el usuario elija volver
                                        break;
                                    case 4:
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                // Maneja la excepción si el usuario no ingresa un número
                                System.out.println("Error: Por favor, ingrese un valor numérico.");
                                scanner.next(); // Limpia el buffer de entrada
                            }
                        } while (opcion2 != 4); // Repite el menú hasta que el usuario elija salir
                        break;
                    case 2:
                        System.out.println("Saliendo..."); // Mensaje de salida
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elija una opción válida."); // Manejo de opción inválida
                }
            } catch (InputMismatchException e) {
                // Maneja la excepción si el usuario no ingresa un número
                System.out.println("Error: Por favor, ingrese un valor numérico.");
                scanner.next(); // Limpia el buffer de entrada
            }
        } while (opcion != 2); // Repite hasta que el usuario elija salir
    }

}
