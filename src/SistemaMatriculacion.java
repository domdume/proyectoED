import java.util.Scanner;
import javax.swing.*;
public class SistemaMatriculacion {
    ListaUsuarios listaUsuarios = new ListaUsuarios();
    ListaDoble listaEstudiantes = new ListaDoble();
    ArbolBinarioBusqueda arbolEstudiantes = new ArbolBinarioBusqueda();
    ColaMatriculacion colaMatriculacion = new ColaMatriculacion(10);

    public static void main(String[] args) {
        SistemaMatriculacion sistema = new SistemaMatriculacion();
        sistema.iniciarSistema();
    }

    void iniciarSistema() {
        // Crear algunos usuarios de prueba
        int opcion;

        listaUsuarios.agregarUsuario(new Administrador("admin", "admin123"));
        agregarEstudiante(new Estudiante("juan", "juan123", 1, "Juan Perez"));
        agregarEstudiante(new Estudiante("maria", "maria123", 2, "Maria Lopez"));
        agregarEstudiante(new Estudiante("salma", "salma123", 3, "Salma Morales"));

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MATRICULACIONES EPN \n" +
                    " ELIJA UNA OPCION \n \n" +
                    "1.Ingreasar al sistema \n"+
                    "2.Cerrar Sistema \n"));

            switch (opcion) {
                case 1:

                    int opcionEstudiante;

                    opcionEstudiante = Integer.parseInt(JOptionPane.showInputDialog(null, "SISTEMA DE MATRICULACIÓN \n" +
                            "ESCUELA POLITÉCNICA NACIONAL \n \n" +
                            "Eliga el modo de Usuario \n "+
                            "1. Estudiante: \n" +
                            "2. Administración: \n"));

                    switch (opcionEstudiante){
                        case 1:
                            String usuario = JOptionPane.showInputDialog(null, "Estudiante: ");
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
                            String usuarioAdmin = JOptionPane.showInputDialog(null, "Administrador: ");
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
                    }

                case 2:
                    System.out.println("Saliendo..."); // del menu de ingresar y cerrar sistema
                    break;
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
                    "4. Salir\n" +
                    "Opción: "));

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
                        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcion != 4);
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
                    colaMatriculacion.agregarSolicitud(estudiante);
                    JOptionPane.showMessageDialog(null, "Solicitud de matriculación enviada");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcion != 2);
    }
}
