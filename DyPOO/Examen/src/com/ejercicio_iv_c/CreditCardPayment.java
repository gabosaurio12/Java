package com.ejercicio_iv_c;

public class CreditCardPayment extends OnlinePayment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Número de tarjeta: " + cardNumber);
        System.out.println("Monto cargado: " + getAmount());
    }
}
