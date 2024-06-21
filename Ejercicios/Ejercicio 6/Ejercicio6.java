// Leer un nombre y que el programe salude con ese nombre //

import java.util.Scanner;

class Ejercicio6 {
	public static void main (String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nombre?");
		String nombre = scn.nextLine();

		System.out.println("Hola, " + nombre);
	}
}