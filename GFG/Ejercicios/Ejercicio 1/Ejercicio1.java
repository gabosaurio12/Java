// Leer 3 calificaciones y promedia las aprobatorias, mínimo 1 debe ser aprobatoria //
import java.util.*;

class Ejercicio1 {
	public static void main (String args[]) {
		int c1, c2, c3, suma, promedio, aprobatorias;

		Scanner scn = new Scanner(System.in);

		System.out.println("Ingresa la primera calificación:");
		c1 = scn.nextInt();
		System.out.println("Ingresa la segunda calificación:");
		c2 = scn.nextInt();
		System.out.println("Ingresa la tercera calificación:");
		c3 = scn.nextInt();

		suma = 0;
		aprobatorias = 0;

		if (c1 > 5) {
			suma += c1;
			aprobatorias++;
		}

		if (c2 > 5) {
			suma += c2;
			aprobatorias++;
		}

		if (c3 > 5) {
			suma += c3;
			aprobatorias++;
		}

		promedio = suma / aprobatorias;

		System.out.println("El promedio de las calificaciones aprobatorias es: " + promedio);
	}
}
