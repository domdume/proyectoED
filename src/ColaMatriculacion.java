import javax.swing.*;

class ColaMatriculacion {
    Estudiante[] cola;
    int frente;
    int fin;
    int capacidad;
    int tamañoActual;

    ColaMatriculacion(int capacidad) {
        this.capacidad = capacidad;
        cola = new Estudiante[capacidad];
        frente = 0;
        fin = -1;
        tamañoActual = 0;
    }

    void agregarSolicitud(Estudiante estudiante) {
        if (tamañoActual == capacidad) {
            JOptionPane.showMessageDialog(null, "La cola de matriculación esta llena");
            return;
        }
        fin = (fin + 1) % capacidad;
        cola[fin] = estudiante;
        tamañoActual++;
    }
    Estudiante procesarSolicitud() {
        if (tamañoActual == 0) {
            JOptionPane.showMessageDialog(null, "No hay solicitudes ha gestionar");
            return null;
        }
        Estudiante temp = cola[frente];
        frente = (frente + 1) % capacidad;
        tamañoActual--;
        return temp;
    }

    Estudiante verPrimeraSolicitud() {
        if (tamañoActual == 0) {
            System.out.println("No hay solicitudes a gestionar");
            return null;
        }
        return cola[frente];
    }

}
