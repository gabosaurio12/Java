package com.excepcionespersonalizadas;

public class Cuenta {
    private Double saldo;
    public Cuenta() {
        this.saldo = 0.0;
    }

    public void depositar(Double deposito) {
        if (deposito > 10000) {
            throw new LimiteDeDepositoExcedidoException("No se puede depositar más de 10,000 por operación");
        } else {
            this.saldo += deposito;
        }
    }

    public void retirar(Double c) throws SaldoInsuficienteException {
        if (this.saldo < c) {
            throw new SaldoInsuficienteException("No cuenta con el saldo suficiente");
        } else {
            this.saldo -= c;
        }
    }

    public Double consultarSaldo() {
        return this.saldo;
    }
}
