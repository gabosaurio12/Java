class Matrices {
	public static void main(String args[]) {
		// Declaramos matriz con [][]
		int[][] matriz = new int[10][10];
		int l = 1;
		
		// Llenamos la raíz
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				matriz[i][k] = l;
				l++;
			}
		}

		// Imprimimos raíz
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				System.out.print(matriz[i][k] + " ");
			}
			System.out.println();
		}
	}
}