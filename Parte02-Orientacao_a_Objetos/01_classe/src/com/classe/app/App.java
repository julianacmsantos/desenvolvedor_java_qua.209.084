package com.classe.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        // instancia a classe Pessoa
        Pessoa pessoa = new Pessoa();

        // entrada de dados
        System.out.println("Informe o nome da pessoa:");
        pessoa.nome = sc.nextLine();

        System.out.println("Informe a idade da pessoa:");
        pessoa.idade = sc.nextInt();

        System.out.println("Informe a altura da pessoa em metros:");
        pessoa.altura = sc.nextDouble();

        // limpeza de buffer
        sc.nextLine();

        System.out.println("Informe o email da pessoa:");
        pessoa.email = sc.nextLine();

        // define os valores dos atributos
        /* pessoa.nome = "Ana Paula";
        pessoa.email = "anapaula@email.com";
        pessoa.idade = 44;
        pessoa.altura = 1.60; */

        // saida dos atributos do objeto
        /*System.out.println("Atributos do objeto:");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Email: " + pessoa.email);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Altura: " + pessoa.altura + " metros"); */

        // chama os metodos
        pessoa.cumprimentar();
        pessoa.apresentar();

        sc.close();
    }
}
