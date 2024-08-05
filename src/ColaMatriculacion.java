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
            System.out.println("La cola de matriculación está llena");
            return;
        }
        fin = (fin + 1) % capacidad;
        cola[fin] = estudiante;
        tamañoActual++;
    }

//    Estudiante procesarSolicitud() {
//        if (tamañoActual == 0) {
//            System.out.println("No hay solicitudes en la cola");
//            return null;
//        }
//        Estudiante temp = cola[frente];
//        frente = (frente + 1) % capacidad;
//        tamañoActual--;
//        return temp;
//    }

    boolean estaMatriculado(Estudiante estudiante) {
        if (tamañoActual == 0) {
            return false;
        }
        int i = frente;
        int count = 0;
        while (count < tamañoActual) {
            if (cola[i] != null && cola[i].id == estudiante.id) {
                return true;
            }
            i = (i + 1) % capacidad;
            count++;
        }
        return false;
    }
}
