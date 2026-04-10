package com.banco.models;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public PessoaFisica(String nome, String cpf, String email) {
        super(email);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("CPF do cliente: " + this.cpf);
        System.out.println("E-mail do cliente: " + this.email);
    }

}
