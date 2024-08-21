import java.util.*;

public class Binario {
    public static int exp(int n, int e) {
        if (e == 0) {
            n = 1;
        }
        else {
            for (int i = 1; i < e; i++) {
                n *= 2;
            }
        }
        return n;
    }
    public static int binario(int b) {
        int n = 0;
        int i = 0;
        while (b > 0) {
            if (b % 10 == 1) {
                int nSum = exp(2,i);
                n += nSum;
            }
            i++;
            b /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa número binario ");
        int nB = scan.nextInt();
        int n = binario(nB);
        System.out.println(n);
    }
}