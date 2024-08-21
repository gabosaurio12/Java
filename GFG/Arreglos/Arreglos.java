class Arreglos {
	public static void main(String args[]) {
		// Declaración del arreglo
		int[] arreglo;

		// Se reserva la memoria para 10 enteros
		arreglo = new int[10];

		// Inicializa el primer elemento
		arreglo[0] = 100;

		// Iniciallizamos los demás
		for (int i = 2; i < 11; i++) {
			arreglo[i-1] = i * 100;
		}

		// Imprimimos los elementos del arreglo
		for (int i = 0; i < 10; i++) {
			System.out.println("P." + i + " " + arreglo[i]);
		}
	}
}