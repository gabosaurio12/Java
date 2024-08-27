public class Lista {
    private int size;
    private Nodo top;
    private Nodo tail;

    public Lista() {
        size = 0;
    }

    public void setSize(int s) { size = s; }
    public int getSize() { return size; }

    public void setTop(Nodo n) { top = n; }
    public Nodo getTop() { return top; }

    public void setTail(Nodo nT) { tail = nT; }
    public Nodo getTail() { return tail; }

    public void add(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setNext(null);
        if (top == null) {
            setTop(nuevo);
            setTail(nuevo);
        }
        else {
            nuevo.setPrev(tail);
            tail.setNext(nuevo);
            setTail(nuevo);
        }
        size++;
    }

    public Nodo search(int dato) {
        boolean found = false;
        Nodo act = getTop();
        int i = 0;
        while (!found && i < getSize()) {
            if (act.getDato() == dato) {
                found = true;
                act = act.getNext();
            }
            i++;
        }
        return act;
    }

    public Nodo searchPosition(int posicion) {
        boolean found = false;
        Nodo act = getTop();
        int i = 0;
        while (!found && i < getSize()) {
            if (i == posicion) {
                found = true;
            }
            else {
                act = act.getNext();
                i++;
            }
        }
        return act;
    }

    public void delete(int posicion) {
        if (posicion == 0) {
            Nodo aux = top.getNext();
            top = null;
            top = aux;
            setSize(getSize() - 1);
        } else if (posicion == getSize() - 1) {
            Nodo aux = tail.getPrev();
            tail = null;
            tail = aux;
            setSize(getSize() - 1);
        } else {
            Nodo aux = searchPosition(posicion);
            if (aux != null) {
                Nodo ant = aux.getPrev();
                Nodo sig = aux.getNext();
                ant.setNext(sig);
                sig.setPrev(ant);
                setSize(getSize() - 1);
            } else {
                System.out.println("No se encontró esa posición");
            }
        }
    }

    public void editPosition(int posicion, int datoNuevo) {
        Nodo aux = searchPosition(posicion);
        if (aux != null) {
            aux.setDato(datoNuevo);
        } else {
            System.out.println("No se encontró esa posición");
        }
    }

    public void print() {
        Nodo aux = getTop();
        for (int i = 0; i < getSize(); i++) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getNext();
        }
        System.out.println();
    }
}
