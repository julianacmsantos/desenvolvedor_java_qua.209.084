package com.polimorfismo.models;

// nao pode ser instanciada
abstract public class Pessoa {

    // atributos
    public String email;
    public String telefone;

    // construtor
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // metodo
    public void exibirDados() {
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
}
