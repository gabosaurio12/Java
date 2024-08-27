public class Nodo {
    private int dato;
    private Nodo next;
    private Nodo prev;

    public Nodo(int d) {
        dato = d;
    }

    public void setDato(int d) { dato = d; }
    public int getDato() { return dato; }

    public void setNext(Nodo n) { next = n; }
    public Nodo getNext() { return next; }

    public void setPrev(Nodo p) { prev = p; }
    public Nodo getPrev() { return prev; }
}
