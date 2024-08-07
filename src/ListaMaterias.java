public class ListaMaterias {
    NodoListaSimple cabeza;

    public ListaMaterias(){
        Materia[] materiasPredeterminadas = {
                new Materia("Programacion I","ccii"),
                new Materia("Fundamento de Redes","ISWK"),
                new Materia("Estructura de datos y Algoritmos","CAJ2")
        };
        for (Materia materia : materiasPredeterminadas){
            agregarMateria(materia);
        }
    }
    void agregarMateria(Materia materia) {
        NodoListaSimple nuevoNodo = new NodoListaSimple(materia);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoListaSimple temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

}
