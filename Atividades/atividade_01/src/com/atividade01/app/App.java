package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crie um programa que recebe do usuário: nome, peso e altura
        // e exiba na tela o valor do seu IMC (Índice de Massa Corporal)
        // e o seu diagnóstico
        // Cálculo do IMC: peso/(altura*altura)
        // Diagnósticos: IMC menor que 18.5 = abaixo do peso
        // IMC entre 18.5 e 25 = peso ideal
        // IMC entre 25 e 30 = acima do peso
        // IMC entre 30 e 35 = obeso
        // IMC entre 35 e 40 = obesidade nível 2
        // IMC maior que 40 = obesidade mórbida

        Scanner sc = new Scanner(System.in);

        // variaveis
        String nome;
        double peso;
        double altura;

        // input
        System.out.println("Informe seu nome:");
        nome = sc.nextLine();

        System.out.println("Informe seu peso:");
        peso = sc.nextDouble();

        System.out.println("Informe sua altura:");
        altura = sc.nextDouble();

        // processamento
        double imc = calcularImc(peso, altura);

        // exibe o IMC e o diagnóstico
        if (imc < 18.5) {
            System.out.println(nome +", seu IMC é " + String.format("%.2f", imc) + " e você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println(nome +", seu IMC é " + String.format("%.2f", imc) + " e você tem o peso ideal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println(nome +", seu IMC é " + String.format("%.2f", imc) + " e você está acima do peso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println(nome +", seu IMC é " + String.format("%.2f", imc) + " e você está obeso.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println(nome +", seu IMC é " + String.format("%.2f", imc) + " e você tem obesidade nível 2.");
        } else {
            System.out.println(nome +", seu IMC é " + String.format("%.2f", imc) + " e você tem obesidade mórbida.");
        }

        // fechar o scanner
        sc.close();

    }   


    public static double calcularImc(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }
}

// alternativa para o cálculo do IMC
/*     String result;
result = (imc < 18.5) ? "abaixo do peso" :
         (imc < 25) ? "peso ideal" :
         (imc < 30) ? "acima do peso" :
         (imc < 35) ? "obeso" :
         (imc < 40) ? "obesidade nível 2" :
         "obesidade mórbida";
 */