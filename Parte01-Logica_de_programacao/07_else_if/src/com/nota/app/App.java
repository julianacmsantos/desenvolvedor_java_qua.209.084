package com.nota.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variaveis
        String nome;
        double nota;

        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Informe seu nome:");
        nome = sc.nextLine();

        System.out.println("Informe sua nota (entre 0 e 10):");
        nota = sc.nextDouble();

        // verifica se a nota é válida
        if (nota >= 0 && nota <= 10) {

            // verifica o status do aluno
            if (nota >= 7) {
            System.out.println(nome + " está aprovado(a)");
            }
            else if (nota >= 5) {
            System.out.println(nome + " está de recuperação(a)");
            }
            else {
            System.out.println(nome + " está reprovado(a)");
            }
        }
        else {
            System.out.println("Nota inválida");
        }

        // fecha o objeto Scanner
        sc.close();
    }
}
