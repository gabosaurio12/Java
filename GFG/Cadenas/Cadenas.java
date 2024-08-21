class Cadenas {
	public static String primeraPalabra(String cad) {
		String palabra = "";
		int longitud = cad.length();
		for (int i = 0; cad.charAt(i) != ' '; i++) {
			palabra += cad.charAt(i);
		}
		return palabra;
	}

	public static int numPalabras(String cad) {
		int cont = 0;
		int longitud = cad.length();
		if (longitud > 0)
			cont++;

		int i = 0;
		while (i < longitud) {
			if (cad.charAt(i) == ' ') {
				cont++;
			}
			i++;
		}
		return cont;
	}
	
	public static void main(String args[]) {
		String cadena = "Hola como estas";
		System.out.println(cadena);
		int longitud = cadena.length();
		int cPal = numPalabras(cadena);
		System.out.println("Numero de palabras " + cPal);
		int i = 0;
		while (i < longitud) {
			System.out.println(cadena.charAt(i));
			i++;
		}

		String primPal = primeraPalabra(cadena);
		System.out.println("Primera palabra: " + primPal);
	}
}
