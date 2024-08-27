import java.util.*;

public class FacPrimos {
	public static boolean esPrimo(int n) {
		boolean band = true;
		int i = 2;
		while (band == true && i < n) {
			if (n % i == 0) {
				band = false;
			}
			i++;
		}
		return band;
	}

	public static void factoresPrimos(int n) {
		for (int i = 1; i < n; i++) {
			if (n % i == 0 && esPrimo(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.print("Ingresa un número ");
		n = scan.nextInt();

		System.out.println("Sus factores primos son: ");
		factoresPrimos(n);
	}
}