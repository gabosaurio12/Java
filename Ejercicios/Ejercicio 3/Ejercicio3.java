// Leer 3 números y escribir el mayor de ellos //

import java.util.*;

class Ejercicio3 {
	public static void main (String args[]) {
		int a, b, c, mayor;
		Scanner scn = new Scanner(System.in);

		System.out.println("Ingresa el primer número");
		a = scn.nextInt();

		System.out.println("Ingresa el segundo número");
		b = scn.nextInt();

		System.out.println("Ingresa el tercer número");
		c = scn.nextInt();
		
		mayor = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c); 
		System.out.println("El número más grande es: " + mayor);

	}
}
