import java.util.*;

class Divtk {
	public static void leerArr(int[] arreglo, int n) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			arreglo[i] = scan.nextInt();
		}
	}

	public static void escribirArr(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void dividir(int[] arr1, int[] arr2, int d, int n) {
		for (int i = 0; i < n; i++) {
			arr2[i] = arr1[i] / d;
		}
	}

	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n, d;

		System.out.print("Longitud del arreglo: ");
		n = scan.nextInt();
		int[] arrPrincipal = new int[n];
		leerArr(arrPrincipal, n);
		
		System.out.print("Divisor: ");
		d = scan.nextInt();

		int[] arrCociente = new int[n];
		dividir(arrPrincipal, arrCociente, d, n);

		System.out.print("Arreglo T ");
		escribirArr(arrPrincipal, n);
		System.out.print("Arreglo Z ");
		escribirArr(arrCociente, n);
	}
}
