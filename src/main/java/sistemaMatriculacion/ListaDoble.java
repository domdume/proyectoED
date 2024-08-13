package sistemaMatriculacion;

import javax.swing.*;

public class ListaDoble {
    
    NodoDoble cabeza;

    public void agregarEstudiante(Estudiante estudiante) {
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
            JOptionPane.showMessageDialog(null, "Código Único: " + temp.estudiante.id + ", Nombre: " + temp.estudiante.nombre);
            temp = temp.siguiente;
        }
    }
    void mostrarEstudiantesMatriculados(ColaMatriculacion colaMatriculacion) {
        NodoDoble temp = cabeza;
        while (temp != null) {
            if (estaMatriculadoEnAlgunaMateria(temp.estudiante)) {
                JOptionPane.showMessageDialog(null, "Código Único: " + temp.estudiante.id + ", Nombre: " + temp.estudiante.nombre);
            }
            temp = temp.siguiente;
        }
    }
    void mostrarEstudiantesMatriculadosPorMateria() {
        NodoDoble temp = cabeza;
        while (temp != null) {
            for (int i = 0; i < temp.estudiante.cantidadSolicitudes; i++) {
                if (temp.estudiante.matriculado[i]) {
                    JOptionPane.showMessageDialog(null, "Código Único: " + temp.estudiante.id +
                            ", Nombre: " + temp.estudiante.nombre +
                            ", Materia Matriculada: " + temp.estudiante.materiasSolicitadas[i].getNombre());
                }
            }
            temp = temp.siguiente;
        }
    }
    
    private boolean estaMatriculadoEnAlgunaMateria(Estudiante estudiante) {
        // Recorre el arreglo de booleanos para verificar si el estudiante está matriculado en alguna materia
        for (boolean matriculado : estudiante.matriculado) {
            if (matriculado) {
                return true; // Si encuentra al menos un `true`, el estudiante está matriculado en alguna materia
            }
        }
        return false; // Si no encuentra ningún `true`, no está matriculado en ninguna materia
    }

    public NodoDoble getCabeza(){
        return cabeza;
    }

    
}
