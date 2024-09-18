package br.com.alura;

import java.math.BigDecimal;
import java.util.Random;

public class Conta{
    private static Random random = new Random();
    private Cliente cliente;
    private BigDecimal saldo;
    private Long agencia;
    private Long numero = random.nextLong(100);
    public Conta(Cliente cliente, BigDecimal saldoInicial) {
        this.saldo = saldoInicial;
        this.cliente = cliente;
        this.agencia = random.nextLong(10);
        this.numero = random.nextLong(100);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void debitaSaldo(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
    }
}
