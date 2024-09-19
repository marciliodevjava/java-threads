package br.com.alura;

public class Impressora implements Runnable {
    private int id;

    public Impressora(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Impressora %s valor %s".formatted(this.id, i));
        }
    }
}
