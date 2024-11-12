package com.ejercicio_iv_c;

public class Main {

    public static void main(String[] args) {
        CreditCardPayment credito = new CreditCardPayment(1000, "123456789");
        credito.processPayment();

        PayPalPayment payPal = new PayPalPayment(2000, "superman@gmail.com");
        payPal.processPayment();
    }
}
