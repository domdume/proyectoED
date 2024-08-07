class Estudiante extends Usuario {
    int id;
    String nombre;
    boolean matriculado;

    Estudiante(String usuario, String contraseña, int id, String nombre) {
        super(usuario, contraseña);
        this.id = id;
        this.nombre = nombre;
        this.matriculado = false; // Inicialmente no está matriculado
    }
}