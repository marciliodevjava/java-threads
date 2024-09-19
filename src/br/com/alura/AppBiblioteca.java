package br.com.alura;

import java.time.LocalDate;

public class AppBiblioteca {

    private static String nome = "A pequena sereia";
    private static String autor = "Alice Wilton";
    private static LocalDate data;
    public static void main(String[] args) {

        Livro livro = new Livro(nome, autor, data);

        OperacaoReversa operacao = new OperacaoReversa(livro);

        Thread operacaoOne = new Thread(operacao, "João");
        Thread operacaoTwo = new Thread(operacao, "Maria");

        operacaoOne.start();
        operacaoTwo.start();

        try {
            operacaoOne.join();
            operacaoTwo.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
