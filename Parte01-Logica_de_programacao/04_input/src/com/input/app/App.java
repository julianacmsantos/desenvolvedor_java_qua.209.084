package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome;
        String email;
        int idade;
        double altura;

        // criar objeto que recebe os dados do usuário
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine(); // método que recebe uma string

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt(); // método que recebe int

        System.out.println("Informe sua altura em metros: ");
        altura = sc.nextDouble();

        // limpeza de buffer para receber uma nova String
        // é necessário realizar a limpeza pois ao captar String e, em seguida, outro tipo primitivo, o Scanner armazena lixo
        sc.nextLine();

        System.out.println("Informe seu e-mail: ");
        email = sc.nextLine();
        
        // saída de dados
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("E-mail: " + email);

        // fecha objeto Scanner
        sc.close();
    }
}
