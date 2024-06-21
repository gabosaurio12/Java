// Leer 3 números y escribir los dos mayores //

import java.util.Scanner;

class Ejercicio5 {
	public static void main (String args []) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, mayor1, mayor2;

		System.out.println("Ingresa los tres números");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		mayor1 = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);

		if (mayor1 == a) {
			mayor2 = (b > c) ? b : c;
		}
		else {
			if (mayor1 == b) {
				mayor2 = (a > c) ? a : c;	
			}
			else {
				mayor2 = (a > b) ? a : b;
			}
		}

		System.out.println("Mayor 1: " + mayor1);
		System.out.println("Mayor 2: " + mayor2);
	}
}
