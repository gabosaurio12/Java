// Leer 2 números y escribir el mayor de ellos //

import java.util.*;

class Ejercicio2 {
	public static void main (String args[]) {
		int n1, n2;
		Scanner scn = new Scanner(System.in);

		System.out.println("Ingresa el primer número");
		n1 = scn.nextInt();

		System.out.println("Ingresa el segundo número");
		n2 = scn.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " Es mayor que " + n2);
		}
		else {
			if (n2 > n1) {
				System.out.println(n2 + " Es mayor que " + n1);
			}
			else{
				System.out.println(n1 + " Es igual a " + n2);
			}
		}
	}
}
