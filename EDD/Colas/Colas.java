import java.util.*;

class Nodo {
	int valor;
	Nodo sig;
}

class Colas { //FIFO
	public static Nodo push(Nodo cab, int nValor) {
		Nodo nuevo = new Nodo();
		nuevo.valor = nValor;
		nuevo.sig = null;

		if (cab == null) {
			cab = nuevo;
		}
		else {
			Nodo aux = cab;
			while (aux.sig != null) {
				aux = aux.sig;
			}
			aux.sig = nuevo;
		}

		return cab;
	}

	public static Nodo pop(Nodo cab) {
		if (cab != null)
			System.out.println("Cabeza: " + cab.valor);
			cab = cab.sig;

		return cab;
	}

	public static void imprimir(Nodo cab) {
		Nodo aux = cab;
		while (aux != null) {
			System.out.print(aux.valor + " ");
			aux = aux.sig;
		}
	}

	public static void main(String args[]) {
		Nodo cabeza = null;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int nVal = scan.nextInt();
			cabeza = push(cabeza, nVal);
		}

		imprimir(cabeza);

		cabeza = pop(cabeza);

		System.out.println();
		imprimir(cabeza);
	}
}