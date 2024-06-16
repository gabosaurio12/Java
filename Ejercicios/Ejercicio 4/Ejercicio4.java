// Leer un número en el rango de [0,9999] e imprimir su número de digitos //

import java.util.Scanner;

class Ejercicio4 {
	public static void main (String args[]) {
		int numero, digitos;
		digitos = 0;
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Ingresa el número: ");
		numero = scn.nextInt();

		if (numero > -1 && numero < 10000) {
			if (numero == 0) {
				System.out.println("El número tiene 1 digito");	
			}
			else {
				while (numero > 0) {
					numero /= 10;
					digitos++;
				}
				
				if (digitos > 1) {
					System.out.println("El número es de " + digitos + " digitos");
				}
				else {
					System.out.println("El número es de " + digitos + " digito");
				}
			}
		}
		else {
			System.out.println("El número está fuera del rango [0,9999]");
		}
	}
}
