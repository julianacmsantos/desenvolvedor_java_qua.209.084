package com.classe.app;

public class Pessoa {

    // atributos
    public String nome;
    public String email;
    public int idade;
    public double altura;
    
    // metodo
    public void cumprimentar() {
        System.out.println("Olá, boa noite!");
    }

    public void apresentar() {
        System.out.println("Eu me chamo " + this.nome
            + ", meu email é " + this.email
            + ", tenho " + this.idade + " anos"
            + " e tenho " + altura + " metros de altura."
        );
      
    }
}
