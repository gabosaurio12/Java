import java.util.*;

class Nodo {
	int valor;
	Nodo izq;
	Nodo der;
}

class Arbol {
	public static Nodo push(Nodo raiz, int nValor) {
		Nodo actual = raiz;
		Nodo anterior = null;

		while (actual != null) {
			anterior = actual;

			if (nValor > actual.valor) {
				actual = actual.der;
			}
			else if (nValor < actual.valor) {
				actual = actual.izq;
			}
			else
				return raiz;
		}

		Nodo nuevo = new Nodo();
		nuevo.valor = nValor;
		nuevo.izq = null;
		nuevo.der = null;

		if (anterior == null) {
			raiz = nuevo;
		} else {
			if (nValor > anterior.valor) {
				anterior.der = nuevo;
			} else {
				anterior.izq = nuevo;
			}
		}
		
		return raiz;
	}

	public static void imprimir(Nodo raiz, int aux) {
		if (raiz != null) {
			imprimir(raiz.der, aux + 1);
			for (int i = 0; i < aux; i++) {
				System.out.print("\t");
			}
			System.out.println(raiz.valor);
			imprimir(raiz.izq, aux + 1);
		}
	}

	public static void main(String args[]) {
		Nodo raiz = null;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int dato = scan.nextInt();
			raiz = push(raiz, dato);
		}

		imprimir(raiz, 0);
	}
}