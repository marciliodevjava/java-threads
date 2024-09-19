package br.com.alura;

public class AppImpressora {
    public static void main(String[] args) {
        Impressora impressoraUm = new Impressora(1);
        Impressora impressoraDois = new Impressora(2);

        Thread operacaoOne = new Thread(impressoraUm, "Impressora UM");
        Thread operacaoTwo = new Thread(impressoraDois, "Impressora DOIS");

        operacaoOne.setPriority(9);
        operacaoTwo.setPriority(10);

        operacaoOne.start();
        operacaoTwo.start();
    }
}
