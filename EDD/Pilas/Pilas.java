import java.util.*;

class Nodo {
	int valor;
	Nodo sig;
}

class Pila { // LIFO
	public static Nodo push(Nodo top, int nVal) {
		Nodo nuevo = new Nodo();
		nuevo.valor = nVal;
		nuevo.sig = top;

		return nuevo;
	}

	public static Nodo pop(Nodo top) {
		if (top != null) {
			System.out.println("Tope: " + top.valor);
			top = top.sig;
		}

		return top;
	}

	public static void imprimir(Nodo top) {
		Nodo aux = top;
		while (aux != null) {
			System.out.print(aux.valor + " ");
			aux = aux.sig;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Nodo tope = null;

		for (int i = 0; i < 5; i++) {
			int nValor = scan.nextInt();
			tope = push(tope, nValor);
		}

		imprimir(tope);

		tope = pop(tope);

		imprimir(tope);
	}
}