package br.com.alura;

import java.time.LocalDate;

public class Livro {
    private String nome;
    private String autor;
    private LocalDate dataLancamento;
    private Boolean reservado = false;

    public Livro(String nome, String autor, LocalDate dataLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public void reserva(){
        this.reservado = true;
    }
}
