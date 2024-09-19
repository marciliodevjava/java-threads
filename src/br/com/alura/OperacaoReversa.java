package br.com.alura;

public class OperacaoReversa implements Runnable {

    private Livro livro;

    public OperacaoReversa(Livro livro){
        this.livro = livro;
    }

    public synchronized void reservarLivro(){
        System.out.println("Iniciando reserva de livro");
        if(this.livro.getReservado() == false){
            this.livro.reserva();
            System.out.println("Reserva efetuada com sucesso! Aproveite a leitura " + Thread.currentThread().getName());
        } else {
            System.out.println("O livro já está reservado! " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        this.reservarLivro();
    }
}
