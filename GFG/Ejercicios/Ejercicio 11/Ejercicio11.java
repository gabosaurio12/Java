// Hacer un programa que determine si un número es primo //

import java.util.Scanner;

class Ejercicio11 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		boolean band = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				band = false;
		}

		if (band)
			System.out.println(n + " Es primo");
		else
			System.out.println(n + " No es primo");
	}
}