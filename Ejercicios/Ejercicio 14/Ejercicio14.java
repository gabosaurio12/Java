import java.util.Scanner;

class Alumno {
	int numLista;
	String nombre;
	String apellido;
	float promedio;

	public void alta(int nListAux) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nombre ");
		String nombreAux = scan.nextLine().toUpperCase();
		System.out.print("Apellido ");
		String apellidoAux = scan.nextLine().toUpperCase();
		System.out.print("Promedio ");
		float promedioAux = scan.nextFloat();

		numLista = nListAux + 1;
		nombre = nombreAux;
		apellido = apellidoAux;
		promedio = promedioAux;
	}
}

class Ejercicio14 {
	public static void imprimirLista(Alumno[] arrListaAux, int nListAux) {
		for (int i = 0; i < nListAux; i++) {
			System.out.println();
			System.out.println("N. Lista " + arrListaAux[i].numLista);
			System.out.println("Nombre " + arrListaAux[i].nombre);
			System.out.println("Apellido " + arrListaAux[i].apellido);
			System.out.println("Promedio " + arrListaAux[i].promedio);
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Alumno[] arrAlumnos = new Alumno[10];
		int nList = 0;

		boolean band = true;
		while (band) {
			System.out.println("1. Alta");
			System.out.println("2. Imprimir Lista");
			System.out.println("3. Salir");

			short opc = scan.nextShort();

			switch (opc) {
				case 1:
					arrAlumnos[nList] = new Alumno();
					arrAlumnos[nList].alta(nList);
					nList++;
					break;
				case 2:
					imprimirLista(arrAlumnos, nList);
					break;
				default:
					band = false;
					break;
			}
		}
	}
}