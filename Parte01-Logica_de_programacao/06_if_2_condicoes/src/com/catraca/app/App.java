package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        double peso;
        double altura;

        // instancia da classe Scanner
        Scanner sc = new Scanner(System.in);

        // input de dados
        System.out.println("Informe seu nome:");
        nome = sc.nextLine();


        System.out.println("Informe seu peso em kg:");
        peso = sc.nextDouble();

        
        System.out.println("Informe sua altura em metros:");
        altura = sc.nextDouble();


        if (peso <= 120 && altura >= 1.25) {
            System.out.println("Entrada de " + nome + " autorizada.");
        }
        else {
            System.out.println("Entrada de " + nome + " não autorizada");
        }



        // fecha o objeto Scanner
        sc.close();
    }
}
