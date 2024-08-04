class ColaMatriculacion {
    Estudiante[] cola;
    int frente;
    int fin;
    int capacidad;

    ColaMatriculacion(int capacidad) {
        this.capacidad = capacidad;
        cola = new Estudiante[capacidad];
        frente = 0;
        fin = -1;
    }

    void agregarSolicitud(Estudiante estudiante) {
        if (fin == capacidad - 1) {
            fin = -1;
        }
        cola[++fin] = estudiante;
    }

    Estudiante procesarSolicitud() {
        Estudiante temp = cola[frente++];
        if (frente == capacidad) {
            frente = 0;
        }
        return temp;
    }
}