package com.banco.app;
import java.util.Scanner;

import com.banco.models.*;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO
        // Crie um programa de aplicativo de banco: 
        // o usuário poderá escolher se deseja entrar como pessoa física ou jurídica, 
        // deverá informar o nome, e-mail e cpf (classe PessoaFisica),
        // ou nome fantasia, razão social, e-mail e cnpj (classe PessoaJuridica),
        // e o programa deverá informar a agência e conta (classe Conta) do titular (os dados do usuário serão setados uma única vez durante todo o programa).
        // Em seguida, o programa deverá exibir as opções para o usuário:
        // consultar dados da conta, fazer saque, fazer depósito, sair do programa.
        // O programa deverá cobrar uma taxa de 0,01% em cima de cada saque feito pela pessoa jurídica.
        // Qualquer saque só poderá ser feito caso o valor do saque seja menor ou igual ao saldo da conta.
        // NOTE use os 4 pilares da orientação a objetos, mais interface e composição
        // E o mais importante: DIVIRTA-SE

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco X");
        System.out.println("Escolha o tipo de cadastro:");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");

        String opcao1 = sc.nextLine();
        String opcao2;

        switch (opcao1) {
            case "1":
                PessoaFisica pessoaFisica = new PessoaFisica(null, null, null);
                System.out.println("Informe o nome:");
                pessoaFisica.setNome(sc.nextLine());
                System.out.println("Informe o CPF:");
                pessoaFisica.setCpf(sc.nextLine());
                System.out.println("Informe o e-mail:");
                pessoaFisica.setEmail(sc.nextLine());
                
                ContaPessoaFisica contaPessoaFisica = new ContaPessoaFisica(null, null, null, 0);
                System.out.println("\nInforme o número da sua conta:");
                contaPessoaFisica.setConta(sc.nextLine());
                System.out.println("Informe a agência da sua conta:");
                contaPessoaFisica.setAgencia(sc.nextLine());
                System.out.println("Informe o saldo inicial da sua conta:");
                contaPessoaFisica.setSaldo(sc.nextDouble());

                System.out.println("\nAgência do cliente: " + contaPessoaFisica.getAgencia());
                System.out.println("Conta do cliente: " + contaPessoaFisica.getConta());
                break;
            case "2":
                PessoaJuridica pessoaJuridica = new PessoaJuridica(null, null, null, null);
                System.out.println("Informe o Nome Fantasia da empresa:");
                pessoaJuridica.setNomeFantasia(sc.nextLine());
                System.out.println("Informe a Razão Social da empresa:");
                pessoaJuridica.setRazaoSocial(sc.nextLine());
                System.out.println("Informe o CNJP da empresa:");
                pessoaJuridica.setCnpj(sc.nextLine());
                System.out.println("Informe o e-mail da empresa:");
                pessoaJuridica.setEmail(sc.nextLine());

                ContaPessoaJuridica contaPessoaJuridica = new ContaPessoaJuridica(null, 0.01, null, null, 0);
                System.out.println("\nInforme a agência da empresa:");
                contaPessoaJuridica.setAgencia(sc.nextLine());
                System.out.println("Informe o número da conta da empresa:");
                contaPessoaJuridica.setConta(sc.nextLine());
                System.out.println("Informe o saldo inicial da conta da empresa:");
                contaPessoaJuridica.setSaldo(sc.nextDouble());

                System.out.println("\nAgência da empresa: " + contaPessoaJuridica.getAgencia());
                System.out.println("Conta da empresa: " + contaPessoaJuridica.getConta());
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        do {
            System.out.println("\nSelecione a opção desejada:");
            System.out.println("A - Consultar dados da conta");
            System.out.println("B - Realizar um saque");
            System.out.println("C - realizar um depósito");
            System.out.println("D - Sair do programa");
            opcao2 = sc.nextLine();

            switch (opcao2) {
                case "A":
                    System.out.println("\nDADOS DA CONTA");
                    if (opcao1 == "1") {
                        //contaPessoaFisica.exibirDados();
                    }
                    break;
                case "B":

                    break;
                case "C":

                    break;
                case "D":
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    break;
            }
} while (opcao2 != "D");

        sc.close();
    }
}
