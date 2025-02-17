package com.excepcionespersonalizadas;

import java.util.Scanner;

public class Cajero {
    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cierre = false;
        Cuenta c = new Cuenta();
        c.depositar(5000.0);
        while (!cierre) {
            desplegarMenu();
            int opc = scn.nextInt();
            switch (opc) {
                case 1:
                    retirarEnCajero(c);
                    break;
                case 2:
                    System.out.printf("Su saldo es de: %s\n", c.consultarSaldo());
                    break;
                case 3:
                    depositarEnCajero(c);
                    break;
                case 4:
                    System.out.println("Vuelva pronto");
                    cierre = true;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
    }

    public static void desplegarMenu() {
        System.out.println("Cajero Banamex");
        System.out.println("1. Retiro de efectivo");
        System.out.println("2. Consulta de saldo");
        System.out.println("3. Deposito a cuenta");
        System.out.println("4. Salir del programa");
        System.out.println("Selecciona una opcion");
    }

    public static void retirarEnCajero(Cuenta c) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Cuanto desea retirar");
        Double cantidadARetirar = scn.nextDouble();
        try {
            c.retirar(cantidadARetirar);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void depositarEnCajero(Cuenta c) throws LimiteDeDepositoExcedidoException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Cuánto va a depositar?");
        Double cantidadADepositar = scn.nextDouble();
        try {
            c.depositar(cantidadADepositar);
        } catch (LimiteDeDepositoExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
