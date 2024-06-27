// Hacer un programa que imprima los primeros 50 números de la serie de Fibonacci //

class Ejercicio12 {
	public static void main(String args[]) {
		long fAnt, fAct, fibo;
		fAnt = 0;
		fAct = 1;

		System.out.print(1 + " ");

		int i = 0;
		do {
			fibo = fAnt + fAct;
			fAnt = fAct;
			fAct = fibo;
			System.out.print(fibo + " ");
			i += 1;
		} while (i < 50);
	}
}