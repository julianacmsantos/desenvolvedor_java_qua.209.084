package com.encapsulamento.models;

abstract public class Pessoa {
    // atributos
    // somente essa classe vai ter acesso aos atributos por serem private
    private String email;
    private String telefone;

    // construtor
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // metodos de acesso (getters e setters)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
