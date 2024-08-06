class ListaUsuarios {
    NodoUsuario cabeza;

    void agregarUsuario(Usuario usuario) {
        NodoUsuario nuevoNodo = new NodoUsuario(usuario);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoUsuario temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    Usuario validarUsuario(String usuario, String contraseña) {
        NodoUsuario temp = cabeza;
        while (temp != null) {
            if (temp.usuario.usuario.equals(usuario) && temp.usuario.contraseña.equals(contraseña)) {
                return temp.usuario;
            }
            temp = temp.siguiente;
        }
        return null;
    }

}