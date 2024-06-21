import java.util.Scanner;

class Ejercicio10 {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa hasta qué tabla quieres imprimir ");
        int n = scan.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int k = 1; k < 11; k++) {
                System.out.println(i + " x " + k + " = " + i * k);
            }
            System.out.println();
        }
    }
}
