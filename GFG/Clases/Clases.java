import java.util.Scanner;

class Alumno {
	String nombre;
	int edad;
	float promedio;

	public void alta() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nombre ");
		String nombre2 = scn.nextLine();
		System.out.print("Edad" );
		int edad2 = scn.nextInt();
		float prom = scn.nextFloat();

		nombre = nombre2;
		edad = edad2;
		promedio = prom;
	}
}
class Clases {
	public static void main(String args[]) {
		Alumno a1 = new Alumno();
		a1.alta();
		System.out.println("Nombre " + a1.nombre);
		System.out.println("Edad " + a1.edad);
		System.out.println("Promedio " + a1.promedio);

	}
}
