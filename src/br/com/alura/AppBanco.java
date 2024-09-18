package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", "025.783.181-90");
        BigDecimal saldoInicial = new BigDecimal(150);
        BigDecimal saqueUm = new BigDecimal(50);
        BigDecimal saqueDois = new BigDecimal(20);
        Conta conta = new Conta(cliente, saldoInicial);

        OperacaoSaque operacao = new OperacaoSaque(conta, saldoInicial);

        Thread saqueDoJoao = new Thread(operacao);
        Thread saqueDoMaria = new Thread(operacao);

        saqueDoJoao.start();
        saqueDoMaria.start();
    }
}
