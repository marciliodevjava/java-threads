package br.com.alura;

public class AppRealizaTarefa {

    public static void main(String[] args) {

        RealizaTarefa tarefa = new RealizaTarefa();

        Thread operacao = new Thread(tarefa);

        System.out.println(operacao.isAlive());

        operacao.start();

        try {
            operacao.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e.getMessage());
        }

        System.out.println(operacao.isAlive());
    }
}
