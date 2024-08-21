import java.io.*;

class Operadores {
	public static void main (String args[]) {
		int a = 10;
		int b = 4;

		System.out.println("Operadores Aritméticos");
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b =" + (a % b) + "\n");

		b = 10;
		System.out.println("Operadores unarios");
		System.out.println("a = 10 \nb = 10");

		System.out.println("Post Incremento: " + (a++));
		System.out.println("Pre Incremento: " + (++a));

		System.out.println("Post Decremento: " + (b--));
		System.out.println("Pre Decremento: " + (--b) + "\n");

		System.out.println("Operadores Relacionales");
		a = 10;
		b = 3;
		int c = 5;
		System.out.println("a = 10 \nb = 3 \n c = 5");

		System.out.println("a > b: " + (a > b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a >= b: " + (a >= b));
		System.out.println("a <= b: " + (a <= b));
		System.out.println("a == c: " + (a == c));
		System.out.println("a != c: " + (a != c) + "\n");

		System.out.println("Operadores Lógicos");
		boolean x = true;
		boolean y = false;

		System.out.println("x && y: " + (x && y));
		System.out.println("x || y: " + (x || y));
		System.out.println("!x: " + (!x) + "\n");

		System.out.println("Operador Ternario");
		a = 20;
		b = 10;
		c = 30;
		int resultado;
		System.out.println("a = 20 \nb = 10 \nc = 30");

		resultado = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		
		System.out.println("El mayor de los tres números es: " + resultado + "\n");

		System.out.println("Diferencia entre usar + y ()");
		a = 5;
		b = 8;
		System.out.println("a = 5 \nb = 8");
		System.out.println("Concatenación a + b: " + a + b);
		System.out.println("Adición (a + b): " + (a + b));
	}
}
