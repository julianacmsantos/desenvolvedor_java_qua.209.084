package com.polimorfismo.app;

import java.util.Scanner;

import com.polimorfismo.models.PessoaFisica;
import com.polimorfismo.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, 0, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        empresa.nomeFantasia = "Cafeteria";
        empresa.cnpj = "85.070.440/0001-78";
        empresa.email = "cafeteria@email.com";
        empresa.telefone = "(61) 98856247";


        System.out.println("DADOS DO USUÁRIO");
        System.out.println("Informe o nome:");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o CPF:");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o e-mail:");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone:");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = sc.nextInt();

        System.err.println("\nDADOS DO USUÁRIO\n");
        usuario.exibirDados();
        System.err.println("\nDADOS DA EMPRESA\n");
        empresa.exibirDados();

        sc.close();
    }
}
