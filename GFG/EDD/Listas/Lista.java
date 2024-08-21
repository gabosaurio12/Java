import java.util.*;

class Nodo {
	int valor;
	Nodo sig;
}

class Lista {
	public static Nodo insertar(Nodo cab, int nValor) {
		Nodo nuevo = new Nodo();
		nuevo.valor = nValor;
		nuevo.sig = null;

		if (cab == null) {
			nuevo.sig = null;
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
			cabeza = insertar(cabeza, valAux);
			i++;
		}

		imprimir(cabeza);
	}
}
