package sistemaMatriculacion;

public class ListaUsuarios {
    NodoListaSimple cabeza;

//    public ListaUsuarios(){
//        Usuario[] usuariosBaseDeDatos = {
//                new Administrador("admin", "admin123"),
//                new Estudiante("juan", "juan123", 202218837, "Juan Perez"),
//                new Estudiante("maria", "maria123", 202220766, "Maria Lopez"),
//                new Estudiante("salma", "salma123", 202220765, "Salma Morales")
//        };
//        for (Usuario usuario : usuariosBaseDeDatos){
//            agregarUsuario(usuario);
//        }
//    }

    public void agregarUsuario(Usuario usuario) {
        NodoListaSimple nuevoNodo = new NodoListaSimple(usuario);
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

    public Usuario validarUsuario(String usuario, String contraseña) {
        
        NodoListaSimple temp = cabeza;
        while (temp != null) {
            
            String tempPassword = String.valueOf(temp.usuario.contraseña);
            
            if (temp.usuario.usuario.equals(usuario) && tempPassword.equals(contraseña)) {
                return temp.usuario;
            }
            
            temp = temp.siguiente;
        }
        return null;
    }
    
}