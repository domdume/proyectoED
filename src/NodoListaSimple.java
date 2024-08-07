class NodoListaSimple {
    Usuario usuario;
    Materia materia;
    NodoListaSimple siguiente;
    NodoListaSimple(Usuario usuario) {
        this.usuario = usuario;
    }
    NodoListaSimple(Materia materia) {
        this.materia = materia;
    }
}