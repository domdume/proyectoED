package sistemaMatriculacion;

import javax.swing.*;

public class ListaMaterias {
    NodoListaSimple cabeza;

    public ListaMaterias(){
        Materia[] materiasPredeterminadas = {
                new Materia("Programación I","CCII"),
                new Materia("Programación II","CCI2"),
                new Materia("Matemáticas Computacionales y Teoría de la Computación","ICCD224"),
                new Materia("Fundamentos de Electrónica para la Computación","ICCD233"),
                new Materia("Sistemas Operativos","SO1"),
                new Materia("Arquitectura de Computadores","ARQ1"),
                new Materia("Estructura de Datos y Algoritmos II","EDA2"),
                new Materia("Álgebra Lineal","MATD113"),
                new Materia("Fundamentos de Redes","FR1"),
                new Materia("Estructura de Datos y Algoritmos I","EDA1")
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
    public Materia buscarPorNombre(String nombre) {
        NodoListaSimple temp = cabeza;
        while (temp != null) {
            if (temp.materia.getNombre().equalsIgnoreCase(nombre)) {
                return temp.materia;
            }
            temp = temp.siguiente;
        }
        return null; // Si no se encuentra, retornar null
    }

    public Materia buscarPorCodigo(String codigo) {
        NodoListaSimple temp = cabeza;
        while (temp != null) {
            if (temp.materia.getCodigo().equalsIgnoreCase(codigo)) {
                return temp.materia;
            }
            temp = temp.siguiente;
        }
        return null; // Si no se encuentra, retornar null
    }
        
    public Materia elegirMateria() {
        int opcion = 0;
        Materia materiaElegida = null;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Buscar Materia:\n \n" +
                        "1. Buscar Materia por nombre\n" +
                        "2. Buscar Materia por código\n" +
                        "3. Salir\n" +
                        "Opción: "));

                switch (opcion) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la Materia: ");
                        materiaElegida = buscarPorNombre(nombre);
                        if (materiaElegida != null) {
                            JOptionPane.showMessageDialog(null, "Materia encontrada: " + materiaElegida.getNombre());
                        } else {
                            JOptionPane.showMessageDialog(null, "Materia no encontrada");
                        }
                        break;
                    case 2:
                        String codigo = JOptionPane.showInputDialog(null, "Ingrese el código de la Materia: ");
                        materiaElegida = buscarPorCodigo(codigo);
                        if (materiaElegida != null) {
                            JOptionPane.showMessageDialog(null, "Materia encontrada: " + materiaElegida.getNombre());
                        } else {
                            JOptionPane.showMessageDialog(null, "Materia no encontrada, asegúrese de escribir bien el codigo de la materia");
                        }
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, por favor ingrese un número");
            }
        } while (opcion != 3 && materiaElegida == null);
        return materiaElegida;
    }
}