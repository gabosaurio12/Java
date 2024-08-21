import java.util.*;

class PromedioN {
	public static void leerArr(float[] arreglo, int n) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			arreglo[i] = scan.nextInt();
		}
	}

	public static float media(float[] a, int n) {
		float suma = 0;
		float med = 0;
		for (int i = 0; i < n; i++) {
			suma += a[i];
		}
		med = suma / n;
		return med;
	}

	public static void main(String args[]) {
		int datos;
		float promedio;
		Scanner scan = new Scanner(System.in);

		System.out.print("Cuantos datos quieres promediar ");
		datos = scan.nextInt();
		float[] arreglo = new float[datos];
		leerArr(arreglo, datos);
		promedio = media(arreglo, datos);

		System.out.println("El promedio es: " + promedio);	
	}
}
