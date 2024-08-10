
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SistemaMatriculacion {
    ListaUsuarios listaUsuarios = new ListaUsuarios();
    ListaMaterias listaMaterias = new ListaMaterias();
    ListaDoble listaEstudiantes = new ListaDoble();
    ArbolBinarioBusqueda arbolEstudiantes = new ArbolBinarioBusqueda();
    ColaMatriculacion colaMatriculacion = new ColaMatriculacion(1000);

    public static void main(String[] args) {
        SistemaMatriculacion sistema = new SistemaMatriculacion();
        sistema.iniciarSistema();
    }

    void iniciarSistema() {
        int opcion;
        listaUsuarios.agregarUsuario(new Administrador("admin", "admin123"));
        agregarEstudiante(new Estudiante("juan", "juan123", 202218837, "Juan Perez"));
        agregarEstudiante(new Estudiante("maria", "maria123", 202220766, "Maria Lopez"));
        agregarEstudiante(new Estudiante("salma", "salma123", 202220765, "Salma Morales"));

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MATRICULACIONES EPN \n" +
                    "ELIJA UNA OPCION \n \n" +
                    "1.Ingresar al sistema \n" +
                    "2.Cerrar Sistema \n \n"));

            switch (opcion) {
                case 1:
                    int opcionEstudiante;
                    opcionEstudiante = Integer.parseInt(JOptionPane.showInputDialog(null, "SISTEMA DE MATRICULACIÓN \n" +
                            "ESCUELA POLITÉCNICA NACIONAL \n \n" +
                            "Eliga el modo de Usuario\n " +
                            "1. Estudiante: \n" +
                            "2. Administrador: \n \n"));
                    switch (opcionEstudiante) {
                        case 1:
                            String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario de estudiante: ");
                            String contraseña = JOptionPane.showInputDialog(null, "Contraseña: ");
                            Usuario user = listaUsuarios.validarUsuario(usuario, contraseña);
                            if (user != null) {
                                if (user instanceof Estudiante) {
                                    menuEstudiante((Estudiante) user);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                            }
                            break;
                        case 2:
                            String usuarioAdmin = JOptionPane.showInputDialog(null, "Ingrese su usuario de administrador: ");
                            String contraseñaAdmin = JOptionPane.showInputDialog(null, "Contraseña: ");
                            Usuario userAdmin = listaUsuarios.validarUsuario(usuarioAdmin, contraseñaAdmin);
                            if (userAdmin != null) {
                                if (userAdmin instanceof Administrador) {
                                    menuAdministrador();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                            }
                            break;
                        default:
                            mostrarMensajeConTiempo("Opción Invalida", 1000);
                    }
                    break;
                    case 2:
                        mostrarMensajeConTiempo("Saliendo...", 1000); // del menú de ingresar y cerrar sistema
                    break;
                    default:
                        mostrarMensajeConTiempo("Opción Invalida", 1000);

            }
        } while (opcion != 2);
    }

    void agregarEstudiante(Estudiante estudiante) {
        listaUsuarios.agregarUsuario(estudiante);
        listaEstudiantes.agregarEstudiante(estudiante);
        arbolEstudiantes.agregarEstudiante(estudiante);
    }

    void menuAdministrador() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Solo Administradores:\n \n" +
                    "1. Ver todos los estudiantes\n" +
                    "2. Ver estudiantes matriculados\n" +
                    "3. Buscar estudiante\n" +
                    "4. Gestionar solicitudes de matriculación\n" +
                    "5. Salir\n \n" +
                    "Opción: \n "));

            switch (opcion) {
                case 1:
                    listaEstudiantes.mostrarEstudiantes();
                    break;
                case 2:
                    listaEstudiantes.mostrarEstudiantesMatriculados(colaMatriculacion);
                    break;
                case 3:
                    int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código único del estudiante: "));
                    Estudiante estudiante = arbolEstudiantes.buscarEstudiante(id);
                    if (estudiante != null) {
                        JOptionPane.showMessageDialog(null, "Código Unico: " + estudiante.id + ", Nombre: " + estudiante.nombre);
                    } else {
//                        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
                        mostrarMensajeConTiempo("Estudiante no encontrado", 2000);
                    }
                    break;
                case 4:
                    gestionarSolicitudesMatriculacion();
                    break;
                case 5:
                    mostrarMensajeConTiempo("Saliendo...", 1000);
                    break;
                default:
//                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    mostrarMensajeConTiempo("Opción Invalida", 1000);
            }
        } while (opcion != 5);
    }
    void gestionarSolicitudesMatriculacion() {
        int opcion = 0;
        do {
            Estudiante solicitudActual = colaMatriculacion.verPrimeraSolicitud();
            if (solicitudActual == null) {
                mostrarMensajeConTiempo("No hay solicitudes ha gestionar", 1000);
                return;
            }
            boolean solicitudProcesada =false;
            for (int i = 0; i < solicitudActual.cantidadSolicitudes; i++) {
                if (!solicitudActual.matriculado[i]) { //Solo procesa las no matriculadas
                    Materia materia = solicitudActual.materiasSolicitadas[i];
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Gestionar Solicitudes de Matriculación:\n \n" +
                            "Estudiante: " + solicitudActual.nombre + " (Código único: " + solicitudActual.id + ")\n" +
                            "Materia solicitada: " + (materia != null ? materia.getNombre() : "N/A") + "\n" +
                            "1. Aceptar solicitud\n" +
                            "2. Rechazar solicitud\n" +
                            "3. Salir\n" +
                            "Opción: "));

                    switch (opcion) {
                        case 1:
                            solicitudActual.matriculado[i] = true;
                            mostrarMensajeConTiempo("La solicitud ha sido aceptada", 3000);
                            solicitudProcesada = true;
                            break;
                        case 2:
                            //solicitudActual.matriculado[i] = false;
                            mostrarMensajeConTiempo("La Solicitud ha sido rechazada", 3000);
                            solicitudProcesada = true;
                            break;
                        case 3:
                            mostrarMensajeConTiempo("Saliendo...", 1000);
                            return; // Sale del método en lugar de solo salir del bucle
                        default:
                            mostrarMensajeConTiempo("Opción Inválida", 1000);
                    }

                    if (solicitudProcesada){
                        break;
                    }
                }
            }
            if (solicitudProcesada) {
                colaMatriculacion.procesarSolicitud(); // Elimina la solicitud después de procesar todas las materias
            }
        } while (opcion != 3);
    }
    void menuEstudiante(Estudiante estudiante) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Solo Estudiantes: \n \n" +
                    "1. Matricularse\n" +
                    "2. Salir\n" +
                    "Opción: "));

            switch (opcion) {
                case 1:
                    Materia materia = listaMaterias.elegirMateria();
                    if (materia != null) {
                        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea matricularse en la materia " + materia.getNombre()
                                + "?", "Confirmar Matrícula", JOptionPane.YES_NO_OPTION);
                        if (confirmar == JOptionPane.YES_OPTION) {
                           // estudiante.materiaSolicitada = materia;
                            estudiante.agregarMateriaSolicitada(materia);
                            colaMatriculacion.agregarSolicitud(estudiante);
                            mostrarMensajeConTiempo("Solicitud de matriculación enviada", 1000);
                        }
                    }
                    break;
                case 2:
                    mostrarMensajeConTiempo("Saliendo...", 1000);
                    break;
                default:
                    mostrarMensajeConTiempo("Opción Inválida", 1000);
            }
        } while (opcion != 2);
    }
    //esta funcion tienen librerias aparte pero solo es para darle tiempo de vida a las ventanas emergentes :c
    void mostrarMensajeConTiempo(String mensaje, int tiempoVisible) {
        JOptionPane optionPane = new JOptionPane(mensaje, JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Mensaje"); //se crea una ventana de dialogo donde se pondrá el mensaje
        Timer timer = new Timer(tiempoVisible, new ActionListener() { //esto digamos que es lo nuevo que se crea un cronómetro
            @Override //lo que dice tiempo visible es int ya que es en milisegundos y si quiero que dure 1 segundo pongo 1000
            public void actionPerformed(ActionEvent e) {
                dialog.dispose(); // esta función lo que hace es que suceda lo del tiempo de vida de la ventana,
                // es parte de la libreria de ActionListener
            }
        });
        timer.setRepeats(false);
        timer.start(); //iniciamos el cronómetro
        dialog.setVisible(true);
    }
}
