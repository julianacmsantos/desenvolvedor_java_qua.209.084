package com.ternario.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        String result;
        int idade;

        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        nome = sc.nextLine();

        System.out.println("Informe sua idade:");
        idade = sc.nextInt();

        // verifica a idade do usuario
        result = (idade >= 18) ? " é maior de idade." : " é menor de idade.";

        // saída de dados
        System.out.println(nome + result);

        // fecha o objeto Scanner
        sc.close();
    }
}
