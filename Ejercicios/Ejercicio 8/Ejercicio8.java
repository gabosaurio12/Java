import java.util.Scanner;

class Ejercicio8 {
	public static void main (String args[]) {
		Scanner scn = new Scanner(System.in);
		char c;

		do {
			c = scn.next().charAt(0);
		}
		while (c != '0');
	}
}
