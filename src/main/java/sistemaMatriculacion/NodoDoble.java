package sistemaMatriculacion;

public class NodoDoble {
    public Estudiante estudiante;
    public NodoDoble siguiente;
    public NodoDoble anterior;

    NodoDoble(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}