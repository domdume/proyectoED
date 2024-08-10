import javax.swing.*;

class Estudiante extends Usuario {
    public int id;
    public String nombre;
    public boolean [] matriculado;
    public Materia[] materiasSolicitadas;
    public int cantidadSolicitudes;

    Estudiante(String usuario, String contraseña, int id, String nombre) {
        super(usuario, contraseña);
        this.id = id;
        this.nombre = nombre;
        this.matriculado = new boolean[6]; // Puede solicitr hasta 6 materias
        this.materiasSolicitadas = new Materia[6];
        this.cantidadSolicitudes = 0;
    }
    public void agregarMateriaSolicitada(Materia materia) {
        if (cantidadSolicitudes < materiasSolicitadas.length) {
            this.materiasSolicitadas[cantidadSolicitudes] = materia;
            this.matriculado[cantidadSolicitudes] = false;
            cantidadSolicitudes++;
        } else {
            JOptionPane.showMessageDialog(null, "No puede solicitar más materias");
        }
    }
}