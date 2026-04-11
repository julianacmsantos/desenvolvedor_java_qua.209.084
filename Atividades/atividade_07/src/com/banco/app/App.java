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

        PessoaFisica pessoaFisica = new PessoaFisica(null, null, null);
        ContaPessoaFisica contaPessoaFisica = new ContaPessoaFisica(pessoaFisica, "1234-5", "10101-1", 0);

        PessoaJuridica pessoaJuridica = new PessoaJuridica(null, null, null, null);
        ContaPessoaJuridica contaPessoaJuridica = new ContaPessoaJuridica(pessoaJuridica, "1265-4", "25470-6", 0);

                
        System.out.println("Bem-vindo ao Banco X");
        System.out.println("Escolha o tipo de cadastro:");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        
        String pessoaTipo = sc.nextLine();

        String opcao;
        double valor;

        switch (pessoaTipo) {
            case "1":
                
                System.out.println("Informe o nome do titular:");
                pessoaFisica.setNome(sc.nextLine());
                System.out.println("Informe o CPF do titular:");
                pessoaFisica.setCpf(sc.nextLine());
                System.out.println("Informe o e-mail do titular:");
                pessoaFisica.setEmail(sc.nextLine());
                
                

                contaPessoaFisica.setPessoaFisica(pessoaFisica);

                break;
            case "2":
                
                System.out.println("Informe o Nome Fantasia da empresa:");
                pessoaJuridica.setNomeFantasia(sc.nextLine());
                System.out.println("Informe a Razão Social da empresa:");
                pessoaJuridica.setRazaoSocial(sc.nextLine());
                System.out.println("Informe o CNJP da empresa:");
                pessoaJuridica.setCnpj(sc.nextLine());
                System.out.println("Informe o e-mail da empresa:");
                pessoaJuridica.setEmail(sc.nextLine());

                

                contaPessoaJuridica.setPessoaJuridica(pessoaJuridica);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    if ("1".equals(pessoaTipo) || "2".equals(pessoaTipo)) {
        do {
            System.out.println("\nSelecione a opção desejada:");
            System.out.println("A - Consultar dados da conta");
            System.out.println("B - Realizar um saque");
            System.out.println("C - realizar um depósito");
            System.out.println("D - Sair do programa");
            opcao = sc.nextLine();

        switch (opcao) {
            case "A":
                System.out.println("\nDADOS DA CONTA");
                if ("1".equals(pessoaTipo)) {
                    contaPessoaFisica.exibirDados();
                }
                else {
                    contaPessoaJuridica.exibirDados();
                }
                break;
            case "B":
                System.out.println("Informe o valor do saque em R$: ");
                valor = sc.nextDouble();
                sc.nextLine();

                if ("1".equals(pessoaTipo)) {
                    if (valor > 0 && valor <= contaPessoaFisica.getSaldo()) {
                        System.out.println("Saque efetuado com sucesso");
                        System.out.println("Saldo atual: R$ " + contaPessoaFisica.fazerSaque(valor));
                    }
                    else {
                        System.out.println("Valor do saque inválido");
                    }
                }    
                else {
                    if (valor > 0 && valor <= contaPessoaJuridica.getSaldo()) {
                        System.out.println("Saldo efetuado com sucesso");
                        System.out.println("Saldo atual: R$ " + contaPessoaJuridica.fazerSaque(valor));
                    }
                    else {
                        System.out.println("Valor do saque inválido");
                    }
                }                
                break;
            case "C":
                System.out.println("Informe o valor do depósito em R$:");
                valor = sc.nextDouble();
                sc.nextLine();

                if ("1".equals(pessoaTipo)) {
                    if (valor > 0) {
                        System.out.println("Valor depositado com sucesso");
                        System.out.println("Saldo atual: " + contaPessoaFisica.fazerDeposito(valor));
                    }
                    else {
                        System.out.println("Valor inválido");
                    }
                }
                else {
                    if (valor > 0) {
                        System.out.println("Valor depositado com sucesso");
                        System.out.println("Saldo atual: R$ " + contaPessoaJuridica.fazerDeposito(valor));
                    }
                }
                break;
            case "D":
                System.out.println("\nSaindo do programa...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
            }
        } while (!"D".equals(opcao));
        }
        else {
            System.out.println("Não foi possível realizar nenhuma operação");
        }
        sc.close();
    }
}
