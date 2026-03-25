package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: atividade 04
        // Desenvolva um programa que crie um objeto da classe Veiculo
        // (pode ser qualquer veiculo) com os atributos:
        // - Fabricante
        // - Modelo
        // - Placa
        // - Ano
        // - Cor
        // O programa deverá mostrar os dados do veiculo
        // NOTE: veiculo não mostra dados, portanto não pode ser via método
        // NOTE: usuário deverá informar dados do veiculo 

        Scanner sc = new Scanner(System.in);

        Veiculo veiculo = new Veiculo();

        // input
        System.out.println("Informe o fabricante do veículo:");
        veiculo.fabricante = sc.nextLine();

        System.out.println("Informe o modelo:");
        veiculo.modelo = sc.nextLine();

        System.out.println("Informe a placa:");
        veiculo.placa = sc.nextLine();

        System.out.println("Informe a cor:");
        veiculo.cor = sc.nextLine();

        System.out.println("Informe o ano:");
        veiculo.ano = sc.nextInt();

       // output
       System.out.println("O fabricante do veículo é " + veiculo.fabricante
        + ", o modelo é " + veiculo.modelo
        + ", a placa é " + veiculo.placa
        + ", a cor é " + veiculo.cor
        + "e o ano é " + veiculo.ano
       );
        sc.close();
    }
}
