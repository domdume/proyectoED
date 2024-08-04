class Estudiante extends Usuario {
    int id;
    String nombre;

    Estudiante(String usuario, String contraseña, int id, String nombre) {
        super(usuario, contraseña);
        this.id = id;
        this.nombre = nombre;
    }
}