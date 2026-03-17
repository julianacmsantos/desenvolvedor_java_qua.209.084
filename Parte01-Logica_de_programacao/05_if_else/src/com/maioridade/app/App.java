package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;

        // instanciar a classe Scanner
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        // verifica a idade informada pelo usuário
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        }   
        else {
            System.out.println(nome + " é menor de idade.");
        } 

        // fecha objeto
        sc.close();
    }
}
