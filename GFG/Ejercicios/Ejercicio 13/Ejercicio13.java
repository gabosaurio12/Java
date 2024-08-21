// Hacer una calculadora //
import java.util.Scanner;

class Ejercicio13 {
	public static int suma (int a, int b) {
		int r = a + b;
		return r;
	}

	public static int resta(int a, int b) {
		int r = a - b;
		return r;
	}

	public static int mult(int a, int b) {
		int r = a * b;
		return r;
	}

	public static int division(int a, int b) {
		int r = a / b;
		return r;
	}

	public static int modulo(int a, int b) {
		int r = a % b;
		return r;
	}

	public static void main (String args[]) {
		Scanner scn = new Scanner(System.in);
		int n1, n2;
		int resultado = 0;
		char opc;

		System.out.println("\tCalculadora");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Módulo");
		opc = scn.next().charAt(0);

		System.out.print("Ingresa un número ");
		n1 = scn.nextInt();
		System.out.print("Ingresa un número ");
		n2 = scn.nextInt();

		switch (opc) {
		case '1':
			resultado = suma(n1, n2);
			break;
		case '2':
			resultado = resta(n1, n2);
			break;
		case '3':
			resultado = mult(n1, n2);
			break;
		case '4':
			resultado = division(n1, n2);
			break;
		case '5':
			resultado = modulo(n1, n2);
			break;
		default:
			System.out.println("Opción inválida");
		}
		System.out.println(resultado);
	}
}