class ListaDoble {
    NodoDoble cabeza;

    void agregarEstudiante(Estudiante estudiante) {
        NodoDoble nuevoNodo = new NodoDoble(estudiante);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoDoble temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.anterior = temp;
        }
    }

    void mostrarEstudiantes() {
        NodoDoble temp = cabeza;
        while (temp != null) {
            System.out.println("ID: " + temp.estudiante.id + ", Nombre: " + temp.estudiante.nombre);
            temp = temp.siguiente;
        }
    }

    void mostrarEstudiantesMatriculados(ColaMatriculacion colaMatriculacion) {
        NodoDoble temp = cabeza;
        while (temp != null) {
            if (colaMatriculacion.estaMatriculado(temp.estudiante)) {
                System.out.println("ID: " + temp.estudiante.id + ", Nombre: " + temp.estudiante.nombre);
            }
            temp = temp.siguiente;
        }
    }
}
