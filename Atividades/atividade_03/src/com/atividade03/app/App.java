package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Recrie o programa da calculadora feito no dia 18/03/2026
        // mas desta vez acrescentando a opção de encerrar o programa
        // quando o usuário quiser

        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0;
        String operador;
        boolean continuar = true;

        // loop para permitir múltiplas operações
        while (continuar) {
            System.out.println("\n=== Calculadora ===");

            // input
            System.out.println("\nInforme o 1º número:");
            num1 = sc.nextDouble();

            System.out.println("Informe o 2º número:");
            num2 = sc.nextDouble();

            // menu
            System.out.println("\nInforme a operação desejada:");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("5 - sair");

            sc.nextLine(); // limpeza do buffer
            operador = sc.nextLine();

                // verifica a operação desejada
                switch (operador) {
                    case "1":
                        result = num1 + num2;
                        System.out.println("\nO valor da soma é " + result);
                        break;
                    case "2":
                        result = num1 - num2;
                        System.out.println("\nO valor da subtração é " + result);
                        break;
                    case "3":
                        result = num1 * num2;
                        System.out.println("\nO valor da multiplicação é " + result);
                        break;
                    case "4":
                        result = num1 / num2;
                        System.out.println("\nO valor da divisão é " + result);
                        break;
                    case "5":
                        continuar = false;
                        System.out.println("\nPrograma encerrado!");
                        break;
                    default:
                        System.out.println("\nOperação inválida!");
                }
        }
        
        sc.close();
    }
    
}
