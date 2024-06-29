import java.util.*;

class Nodo {
	int valor;
	Nodo sig;
}

class Lista {
	public static void insertar(Nodo cab, int nValor) {
		Nodo nuevo = new Nodo();
		nuevo.valor = nValor;
		if (cab == null) {
			nuevo.sig = null;
			cab = nuevo;
		}
		else {
			nuevo.sig = null;
		}
	}

	public static void imprimir(Nodo cab) {
		Nodo act = cab;
		while (act != null) {
			System.out.println(act.valor);
			act = act.sig;
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		boolean band = true;
		Nodo cabeza = null;
		int i = 0;
		while (i < 5) {
			System.out.print("Ingresa el valor ");
			int valAux = scan.nextInt();
			insertar(cabeza, valAux);
			i++;
		}

		imprimir(cabeza);
	}
}
