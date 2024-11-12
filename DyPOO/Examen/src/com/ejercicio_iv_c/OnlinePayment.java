package com.ejercicio_iv_c;

public abstract class OnlinePayment implements Payment {
    protected double amount;

    public OnlinePayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void processPayment();
}
