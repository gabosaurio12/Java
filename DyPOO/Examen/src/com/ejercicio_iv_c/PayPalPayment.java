package com.ejercicio_iv_c;

public class PayPalPayment extends OnlinePayment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Email: " + email);
        System.out.println("Monto cargado: " + getAmount());
    }
}
