class Estudiante extends Usuario {
    public int id;
    public String nombre;
    public boolean matriculado;
    public Materia materiaSolicitada;

    Estudiante(String usuario, String contraseña, int id, String nombre) {
        super(usuario, contraseña);
        this.id = id;
        this.nombre = nombre;
        this.matriculado = false; // Inicialmente no está matriculado
        this.materiaSolicitada = null;
    }
}