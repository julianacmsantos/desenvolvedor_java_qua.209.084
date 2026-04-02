package com.encapsulamento.models;

final public class PessoaFisica extends Pessoa {
    // atributos
    // somente essa classe vai ter acesso aos atributos por serem private
    private String nome;
    private String cpf;

    // construtor

    public PessoaFisica(String nome, String cpf, String email, String telefone) {
        super(email, telefone);
        this.nome = nome;
        this.cpf = cpf;
    }

    // metodos de acesso (getters e setters)
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

}
