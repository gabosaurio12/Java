import java.util.*;

public class Salario {
    public static float salario(int horas, float pagoPorHora) {
        float salario = horas * pagoPorHora;
        return salario;
    }
    public static void main(String[] args) {
        int horas;
        float salarioPorHora;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa las horas que trabajaste ");
        horas = scan.nextInt();
        System.out.print("Ingresa tu pago por hora ");
        salarioPorHora = scan.nextFloat();
        System.out.println("Tu salario es de " + salario(horas,salarioPorHora));

    }
}