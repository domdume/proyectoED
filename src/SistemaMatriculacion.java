import java.util.Scanner;

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
            Scanner scanner = new Scanner(System.in);
            System.out.println("BN AL SISTEMA UNIVERSIDAD MORALES");
            System.out.println("1. INGRESAR");
            System.out.println("2. CERRAR SISTEMA");
            System.out.println("Bienvenido al Sistema de Matriculación");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Usuario: ");
                    String usuario = scanner1.nextLine();
                    System.out.print("Contraseña: ");
                    String contraseña = scanner1.nextLine();

                    Usuario user = listaUsuarios.validarUsuario(usuario, contraseña);

                    if (user != null) {
                        if (user instanceof Administrador) {
                            menuAdministrador();
                        } else if (user instanceof Estudiante) {
                            menuEstudiante((Estudiante) user);
                        }
                    } else {
                        System.out.println("Usuario o contraseña incorrectos");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo...");
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
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Administrador:");
            System.out.println("1. Ver todos los estudiantes");
            System.out.println("2. Ver estudiantes matriculados");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listaEstudiantes.mostrarEstudiantes();
                    break;
                case 2:
                    listaEstudiantes.mostrarEstudiantesMatriculados(colaMatriculacion);
                    break;
                case 3:
                    System.out.print("Ingrese el ID del estudiante: ");
                    int id = scanner.nextInt();
                    Estudiante estudiante = arbolEstudiantes.buscarEstudiante(id);
                    if (estudiante != null) {
                        System.out.println("ID: " + estudiante.id + ", Nombre: " + estudiante.nombre);
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }

    void menuEstudiante(Estudiante estudiante) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Estudiante:");
            System.out.println("1. Matricularse");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    colaMatriculacion.agregarSolicitud(estudiante);
                    System.out.println("Solicitud de matriculación enviada");

                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 2);
    }
}
