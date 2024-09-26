package com.dypoo8;

public class Main {

	public static void imprimir(int[] tab) {
		int i = 0;
		while (i < 64) {
			for (int j = 0; j < 8; j++) {
				if (tab[i] == 1)
					System.out.print(tab[i]);
				else
					System.out.print("0");
				i++;
			}
			System.out.println();
		}
	}

    public static void main(String[] args) {
        Tablero tablero = new Tablero(8);
        System.out.println("Ataques: " + tablero.contarAtaques(tablero.x));
        System.out.println("Evals: " + tablero.evals);
        BusquedaLocal bL = new BusquedaLocal(tablero);
        Solucion s = bL.Algoritmo();
        tablero.s = s;

        System.out.println("Ataques: " + tablero.contarAtaques(tablero.x));
        System.out.println("Evals: " + tablero.evals);
		imprimir(s.permutacion);

    }
}
