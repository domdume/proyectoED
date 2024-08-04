class ArbolBinarioBusqueda {
    NodoBST raiz;

    void agregarEstudiante(Estudiante estudiante) {
        raiz = agregarRecursivo(raiz, estudiante);
    }

    NodoBST agregarRecursivo(NodoBST actual, Estudiante estudiante) {
        if (actual == null) {
            return new NodoBST(estudiante);
        }

        if (estudiante.id < actual.estudiante.id) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, estudiante);
        } else if (estudiante.id > actual.estudiante.id) {
            actual.derecho = agregarRecursivo(actual.derecho, estudiante);
        }

        return actual;
    }

    Estudiante buscarEstudiante(int id) {
        return buscarRecursivo(raiz, id);
    }

    Estudiante buscarRecursivo(NodoBST actual, int id) {
        if (actual == null) {
            return null;
        }

        if (id == actual.estudiante.id) {
            return actual.estudiante;
        }

        return id < actual.estudiante.id
                ? buscarRecursivo(actual.izquierdo, id)
                : buscarRecursivo(actual.derecho, id);
    }
}