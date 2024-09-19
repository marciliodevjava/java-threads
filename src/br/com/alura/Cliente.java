package br.com.alura;

public class Cliente {
    private String nome;
    private Long cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = this.montarCpf(cpf);
    }

    private Long montarCpf(String cpf) {
        String formatter = cpf.replace(".", "").replace("-", "").replace(" ", "");
        return Long.valueOf(formatter);
    }

    public String getNome() {
        return nome;
    }
}
