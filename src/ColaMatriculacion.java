import javax.swing.*;

class ColaMatriculacion {
    Estudiante[] cola;
    int frente;
    int fin;
    private int tamaño;

    public ColaMatriculacion(int capacidad) {
        cola = new Estudiante[capacidad];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    public void agregarSolicitud(Estudiante estudiante) {
        if (tamaño < cola.length) {
            fin = (fin + 1) % cola.length;
            cola[fin] = estudiante;
            tamaño++;
        } else {
            System.out.println("La cola está llena. No se puede agregar más solicitudes.");
        }
    }

    public Estudiante verPrimeraSolicitud() {
        if (tamaño > 0) {
            return cola[frente];
        } else {
            return null;
        }
    }

    public void procesarSolicitud() {
        if (tamaño > 0) {
            frente = (frente + 1) % cola.length;
            tamaño--;
        } else {
            System.out.println("No hay solicitudes para procesar.");
        }
    }
}
