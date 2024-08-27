import java.util.*;

public class Fibo {
	public static void fibo(int n) {
		int p0 = 0;
		int p1 = 1;
		int i = p1;
		System.out.print("1 ");
		while (i < n) {
			int p3 = p0 + p1;
			System.out.print(p3 + " ");
			p0 = p1;
			p1 = p3;
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hasta qué número quieres imprimir ");
		int n = scan.nextInt();
		fibo(n);
	}
}