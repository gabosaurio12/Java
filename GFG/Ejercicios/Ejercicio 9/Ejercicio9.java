import java.util.Scanner;

class Ejercicio9 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int p = 0;

		for (int i = 1; i < n; i++) {
			int k = 2;
			boolean band = false;

			while (!band && k < i) {
				if (i % k == 0)
					band = true;
				k++;
			}
			if (!band) {
				a[p] = i;
				p++;
			}
		}

		for (int i = 0; i < p; i++) {
			System.out.print(a[i] + " ");
		}
	}
}