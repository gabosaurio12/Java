import java.util.*;

public class EsPrimo {
    public static boolean primo(int n) {
        boolean band = true;
        int i = 2;
        while (band && i < n) {
            if (n % i == 0) {
                band = false;
            }
            i++;
        }
        return band;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Ingresa un número ");
        n = scan.nextInt();
        System.out.println(primo(n));
    }
}