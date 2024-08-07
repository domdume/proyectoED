class ListaUsuarios {
    NodoListaSimple cabeza;

    void agregarUsuario(Usuario usuario) {
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

    Usuario validarUsuario(String usuario, String contraseña) {
        NodoListaSimple temp = cabeza;
        while (temp != null) {
            if (temp.usuario.usuario.equals(usuario) && temp.usuario.contraseña.equals(contraseña)) {
                return temp.usuario;
            }
            temp = temp.siguiente;
        }
        return null;
    }
}