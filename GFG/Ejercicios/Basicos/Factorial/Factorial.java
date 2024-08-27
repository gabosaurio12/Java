import java.util.*;

public class Factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa un número ");
        int n = scan.nextInt();

        System.out.println(fact(n));
    }
}