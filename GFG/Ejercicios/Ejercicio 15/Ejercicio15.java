// Hacer un programa que escriba la serie de Fibonacci de 0 a N //

import java.util.*;

class Ejercicio15 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(1);

		System.out.print("Escribe N ");
		int n = scan.nextInt();

		for (int i = 2; i < n; i++) {
			lista.add(lista.get(i-2) + lista.get(i-1));
		}

		System.out.println("Fibonacci");
		for (int i = 0; i < n; i++) {
			System.out.print(lista.get(i) + " ");
		}
	}
}
