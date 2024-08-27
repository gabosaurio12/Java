import java.util.*;

public class PosNegCero {
    public static void leerArreglo(int[] a, int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
    }

    public static void posNegCer(int[] a, int n) {
        int pos = 0;
        int neg = 0;
        int cero = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                pos++;
            } else if (a[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }

        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Cero: " + cero);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Cuantos números vas a ingresar? ");
        n = scan.nextInt();
        int[] arreglo = new int[n];
        leerArreglo(arreglo,n);
        posNegCer(arreglo,n);
    }
}