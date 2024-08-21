import java.util.*;

class MediaDe3 {
	public static int media3(int a, int b, int c) {
		int suma = a + b + c;
		int media = suma / 3;
		return media;
	}

	public static void main(String args[]) {
		int a, b, c, promedio;
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingresa 3 números");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		promedio = media3(a, b, c);
		System.out.println("El promedio es: " + promedio);
	}
}
