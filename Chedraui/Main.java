import java.util.*;

public class Main {
	public char paginaPrincipal() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Chedraui");
		System.out.println("1. Alta");
		System.out.println("2. Venta");
		System.out.println("3. Editar");
		System.out.println("4. Inventario");
		System.out.println("5. Salir");
		char opc = scan.next().charAt(0);
		return opc;
	}

	public String tipo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tipo");
		System.out.println("\tA) COMIDA");
		System.out.println("\tB) JUGUETES");
		System.out.println("\tC) PAPELERÍA");
		System.out.println("\tD) COCINA");
		System.out.println("\tE) OTROS");
		char tip = scan.next().charAt(0);
		String tipo = "";
		switch (tip) {
			case 'a':
				tipo = "COMIDA";
				break;
			case 'b':
				tipo = "JUGUETES";
				break;
			case 'c':
				tipo = "PAPELERÍA";
				break;
			case 'd':
				tipo = "COCINA";
				break;
			default:
				tipo = "OTROS";
				break;
		}

		return tipo;
	}

	public int digitos(int n) {
		int d = 0;
		while (n > 0) {
			d++;
			n /= 10;
		}
		return d;
	}

	public String generarClave(int num, String nom) {
		String clv = "";
		String n = String.valueOf(num);
		for (int digNum = digitos(num); digNum < 3; digNum++) {
			clv = clv.concat("0");
		}
		clv = clv.concat(n);
		for (int i = 0; i < 3; i++) {
			clv = clv.concat(String.valueOf(nom.charAt(i)));
		}
		return clv;
	}

	public void alta(int num, Map<String, Producto> inv) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Nombre ");
		String nom = scan.nextLine();
		String nomMayus = nom.toUpperCase();
		
		String tip = tipo();

		System.out.print("Precio ");
		float prec = scan.nextFloat();

		Producto nuevo = new Producto(nomMayus, tip, prec);

		String clave = generarClave(num, nomMayus);

		inv.put(clave, nuevo);
	}

	public void inventario(Map<String, Producto> inv) {
		for (Map.Entry<String, Producto> aux : inv.entrySet()) {
			System.out.println("Codigo " + aux.getKey());
			System.out.println("Nombre " + aux.getValue().getNombre());
			System.out.println("Tipo " + aux.getValue().getTipo());
			System.out.println("Precio $" + aux.getValue().getPrecio());
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Main app = new Main();
		Map<String, Producto> inventario = new LinkedHashMap<>();
		Scanner scan = new Scanner(System.in);

		int numProd = 1;
		char opc;

		do {
			System.out.print("\033[H\033[2J");
			opc = app.paginaPrincipal();
			switch (opc) {
				case '1':
					System.out.print("\033[H\033[2J");
					app.alta(numProd++, inventario);
					break;
				case '4':
					System.out.print("\033[H\033[2J");
					app.inventario(inventario);
					scan.nextLine();
					break;
				case '5':
					System.out.print("\033[H\033[2J");
					System.out.println("Cerrando . . .");
					break;
				default:
					System.out.println("Opción inválida");
			}
		} while (opc != '5');
	}
}
