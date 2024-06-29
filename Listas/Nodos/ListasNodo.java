class Nodo {
	int valor;
	Nodo sig;

	public Nodo (int val) {
		this.valor = val;
	}
}

class ListasNodo {
	public static void main(String args[]) {
		Nodo nod1 = new Nodo(10);
		Nodo nod2 = new Nodo(20);
		Nodo nod3 = new Nodo(30);

		nod1.sig = nod2;
		nod2.sig = nod3;

		System.out.println("Imprimir lista");
		
		Nodo lista = nod1;
		while (lista != null) {
			System.out.println(lista.valor);
			lista = lista.sig;
		}
	}
}
