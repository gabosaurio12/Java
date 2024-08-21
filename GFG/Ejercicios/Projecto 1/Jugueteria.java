import java.util.Scanner;

class Juguete {
	String codigo;
	String nombre;
	String marca;
	float precio;
	int cantidadPilas;

	public int digitos(int num) {
		int d;
		for(d = 0; num > 0; d++) {
			num /= 10;
		}

		return d;
	}

	public String generarCodigo(char letra, int num) {
		String cod = "";
		cod = cod + letra;
		String numCad = String.valueOf(num);

		for(int i = digitos(num); i < 3; i++) {
			cod = cod + "0";
		}

		cod = cod + numCad;
		return cod;
	}

	public void altaJuguete(int nJug) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nombre ");
		String nombreAux = scan.nextLine().toUpperCase();
		System.out.print("Marca ");
		String marcaAux = scan.nextLine().toUpperCase();
		System.out.print("Precio ");
		float precioAux = scan.nextFloat();
		System.out.print("Cantidad de Pilas ");
		int pilasAux = scan.nextInt();

		boolean correccion = true;
		while(correccion) {
			System.out.println();
			System.out.println("Nombre " + nombreAux);
			System.out.println("Marca " + marcaAux);
			System.out.println("Precio " + precioAux);
			System.out.println("Cantidad de Pilas " + pilasAux);
			System.out.print("Es correcto? s/n ");

			char sn = scan.next().charAt(0);
			scan.nextLine();

			if (sn == 's') {
				codigo = generarCodigo(marcaAux.charAt(0), nJug);
				nombre = nombreAux;
				marca = marcaAux;
				precio = precioAux;
				cantidadPilas = pilasAux;
				System.out.println();
				System.out.println("Codigo " + codigo);
				System.out.println("Nombre " + nombre);
				System.out.println("Marca " + marca);
				System.out.println("Precio " + precio);
				System.out.println("Cantidad de Pilas " + cantidadPilas);
				System.out.println("Dado de alta");
				correccion = false;
			}
			else if (sn == 'n') {
				System.out.println();
				System.out.println("Qué dato quiere corregir?");
				System.out.println("1. Nombre ");
				System.out.println("2. Marca ");
				System.out.println("3. Precio ");
				System.out.println("4. Cantidad de Pilas ");

				char datoC = scan.next().charAt(0);
				scan.nextLine();
				System.out.print("Nuevo dato ");

				switch (datoC) {
				case '1':
					nombreAux = scan.nextLine().toUpperCase();
					break;
				case '2':
					marcaAux = scan.nextLine().toUpperCase();
					break;
				case '3':
					precioAux = scan.nextFloat();
					scan.nextLine();
					break;
				case '4':
					pilasAux = scan.nextInt();
					scan.nextLine();
					break;
				}
			}
		}
	}
}

class Jugueteria {

	public static void editarJuguete(Juguete[] cat, int n) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Codigo ");
		String codEdit = scan.nextLine().toUpperCase();

		boolean band = false;
		int i = 0;
		while (!band && i < n) {
			if (cat[i].codigo.equals(codEdit)) {
				band = true;
			}
			else
				i++;
		}

		if (!band)
			System.out.println("Juguete no encontrado");
		else {
			System.out.println();
			System.out.println("Nombre " + cat[i].nombre);
			System.out.println("Marca " + cat[i].marca);
			System.out.println("Precio " + cat[i].precio);
			System.out.println("Cantidad de Pilas " + cat[i].cantidadPilas);
			System.out.println();

			System.out.println("Qué dato quiere editar?");
			System.out.println("1. Nombre");
			System.out.println("2. Marca");
			System.out.println("3. Precio");
			System.out.println("4. Cantidad de Pilas");
			char datEdit = scan.next().charAt(0);
			scan.nextLine();

			switch (datEdit) {
				case '1':
					System.out.print("Nombre ");
					cat[i].nombre = scan.nextLine().toUpperCase();
					break;
				
				case '2':
					System.out.print("Marca ");
					cat[i].marca = scan.nextLine().toUpperCase();
					break;

				case '3':
					System.out.print("Precio ");
					cat[i].precio = scan.nextFloat();
					break;

				case '4':
					System.out.print("Cantidad de Pilas ");
					cat[i].cantidadPilas = scan.nextInt();
					break;

				default:
					break;
			}
		}
	}

	public static void mostrarCat(Juguete[] cat, int tamaño) {
		for (int i = 0; i < tamaño; i++) {
			System.out.println("Codigo " + cat[i].codigo);
			System.out.println("Nombre " + cat[i].nombre);
			System.out.println("Marca " + cat[i].marca);
			System.out.println("Precio " + cat[i].precio);
			System.out.println("Cantidad de Pilas " + cat[i].cantidadPilas);
			System.out.println();
		}
	}

	public static void buscarMarca(Juguete[] cat, int tamaño) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Marca ");
		String marc = scan.nextLine().toUpperCase();
		for (int i = 0; i < tamaño; i++) {
			if (marc.equals(cat[i].marca)) {
				System.out.println("Codigo " + cat[i].codigo);
				System.out.println("Nombre " + cat[i].nombre);
				System.out.println("Marca " + cat[i].marca);
				System.out.println("Precio " + cat[i].precio);
				System.out.println("Cantidad de Pilas " + cat[i].cantidadPilas);
				System.out.println();
			}
		}
	}

	public static void buscarPrecio(Juguete[] cat, int tamaño) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Precio Mínimo ");
		float min = scan.nextFloat();
		System.out.print("Precio Máximo ");
		float max = scan.nextFloat();

		for (int i = 0; i < tamaño; i++) {
			if (cat[i].precio > min && cat[i].precio < max) {
				System.out.println("Codigo " + cat[i].codigo);
				System.out.println("Nombre " + cat[i].nombre);
				System.out.println("Marca " + cat[i].marca);
				System.out.println("Precio " + cat[i].precio);
				System.out.println("Cantidad de Pilas " + cat[i].cantidadPilas);
				System.out.println();
			}
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Juguete[] listaJuguetes = new Juguete[100];
		int nJuguetes = 0;
		boolean band = true;
		System.out.print("\033[H\033[2J");
		System.out.flush();

		while(band) {
			System.out.println("\t\tJugetería");
			System.out.println("1. Alta de Juguete");
			System.out.println("2. Editar Juguete");
			System.out.println("3. Mostrar Catálogo");
			System.out.println("4. Buscar Jugetes");
			System.out.println("5. Salir");
			char opcion = scan.next().charAt(0);

			switch(opcion) {
				case '1':
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println("\tAlta de Juguete");
					listaJuguetes[nJuguetes] = new Juguete();
					listaJuguetes[nJuguetes].altaJuguete(nJuguetes + 1);
					nJuguetes++;
					break;

				case '2':
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println("Editar Juguete");
					editarJuguete(listaJuguetes, nJuguetes);
					break;

				case '3':
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println("\tCatálogo");
					mostrarCat(listaJuguetes, nJuguetes);
					break;

				case '4':
					System.out.print("\033[H\033[2J");
					System.out.flush();

					System.out.println("Buscar por:");
					System.out.println("1. Marca");
					System.out.println("2. Precio");
					char busq = scan.next().charAt(0);
					System.out.println();

					if (busq == '1') {
						buscarMarca(listaJuguetes, nJuguetes);
					}
					else if (busq == '2') {
						buscarPrecio(listaJuguetes, nJuguetes);
					}
					break;

				case '5':
					band = false;
					break;
			}	
		}
	}
}