import java.util.*;

class Entero {
	int valor;
}

public class Intercambios {
	public static void inter(Entero n1, Entero n2) {
		int aux = n1.valor;
		n1.valor = n2.valor;
		n2.valor = aux;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Entero a = new Entero();
		Entero b = new Entero();
		System.out.print("Ingresa el primer número ");
		a.valor = scan.nextInt();
		System.out.print("Ingresa el segundo número ");
		b.valor = scan.nextInt();
		inter(a,b);
		System.out.println("a = " + a.valor);
		System.out.println("b = " + b.valor);
	}
}