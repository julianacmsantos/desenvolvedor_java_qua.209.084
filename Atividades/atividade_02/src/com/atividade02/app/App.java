package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Crie um programa que receba do usuário o nome e a idade (1x)
        // e depois exiba uma lista de filmes
        // Sala 01 - A Roda Quadrada - Livre
        // Sala 02 - A Volta dos que não foram - 12 anos
        // Sala 03 - Poeira em Alto Mar - 14 anos
        // Sala 04 - As Tranças do Rei Careca - 16 anos
        // Sala 05 - A vingança do Peixe Frito - 18 anos
        // O usuário deverá escolher o filme desejado
        // se tiver a idade mínima para ver o filme, o programa imprime o ingresso e encerra
        // se não tiver a idade mínima, o programa bloqueia a entrada e re-exibe a lista de filmes 
        // para que o usuário possa escolher outro filme

        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        int idade;
        int idadeMin = 0;
        int codFilme;        
        int ingressoEmitido = 0;

        // declaração de variáveis de conteúdo
        String negativa = "\nInfelizmente você não pode assistir esse filme, ";
        String filmes = "1 - A Roda Quadrada \n2 - A Volta dos que não foram \n3 - Poeira em Alto Mar \n4 - As Tranças do Rei Careca \n5 - A vingança do Peixe Frito";
        String outroFilme = "\nEscolha outro filme:";
        String classIndicativa = "Classificação indicativa: ";

        // input
        System.out.println("Informe seu nome:");
        nome = sc.nextLine();

        System.out.println("Informe sua idade:");
        idade = sc.nextInt();      

        System.err.println("\nBem-vindo(a) ao cinema, " + nome + "!");

        // lógica
        do {
        System.err.println("\n--- FILMES EM CARTAZ ---\n");
        System.err.println(filmes);
        System.out.println("\nEscolha o filme que deseja ver:");
        codFilme = sc.nextInt();

        switch (codFilme) {
            case (1):
                System.out.println("\nBom filme, "  + nome + "!");
                ingressoEmitido = 1;
                break; 
            case (2):
                idadeMin = 12;
                if (idade >= idadeMin) {
                    System.out.println("\nBom filme, " + nome + "!");
                    ingressoEmitido = 1;
                }
                else {
                    System.out.println(negativa + nome + "!");
                    System.out.println(classIndicativa + idadeMin + " anos");
                    System.out.println(outroFilme);
                }
                break;
            case (3):
                idadeMin = 14;
                if (idade >= idadeMin) {
                    System.out.println("\nBom filme, " + nome + "!");
                    ingressoEmitido = 1;
                }
                else {
                    System.out.println(negativa + nome + "!");
                    System.out.println(classIndicativa + idadeMin + " anos");
                    System.out.println(outroFilme);                                        
                }
                break;
            case (4):
                idadeMin = 16;
                if (idade >= idadeMin) {
                    System.out.println("\nBom filme, " + nome + "!");
                    ingressoEmitido = 1;
                }
                else {
                    System.out.println(negativa + nome + "!");
                    System.out.println(classIndicativa + idadeMin + " anos");
                    System.out.println(outroFilme);                    
                }
                break;
            case (5):
                idadeMin = 18;
                if (idade >= idadeMin) {
                    System.out.println("\nBom filme, " + nome + "!");
                    ingressoEmitido = 1;
                }
                else {
                    System.out.println(negativa + nome + "!");
                    System.out.println(classIndicativa + idadeMin + " anos");
                    System.out.println(outroFilme);
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (ingressoEmitido == 0);

    
        sc.close();
    }
}
