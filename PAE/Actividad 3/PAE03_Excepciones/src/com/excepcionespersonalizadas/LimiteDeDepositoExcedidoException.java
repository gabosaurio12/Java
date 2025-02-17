package com.excepcionespersonalizadas;

public class LimiteDeDepositoExcedidoException extends RuntimeException {
    public LimiteDeDepositoExcedidoException(String mensaje) {
        super(mensaje);
    }
}
