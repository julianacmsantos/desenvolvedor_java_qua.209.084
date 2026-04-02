package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.PessoaFisica;
import com.encapsulamento.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        // input dados da empresa
        empresa.setNomeFantasia("Lan House");
        empresa.setCnpj("34.964.690/0001-10");
        empresa.setEmail("lanhouse@email.com");
        empresa.setTelefone("(61) 99885-6547");

        // input dados do usuario
        System.out.println("Informe o nome:");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o CPF:");
        usuario.setCpf(sc.nextLine());
        System.out.println("Informe o e-mail:");
        usuario.setEmail(sc.nextLine());
        System.out.println("Informe o telefone:");
        usuario.setTelefone(sc.nextLine());

        System.out.println("\nDADOS DO USUÁRIO:\n");
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("CPF do usuário: " + usuario.getCpf());
        System.out.println("E-mail do usuário: " + usuario.getEmail());
        System.out.println("Telefone do usuário: " + usuario.getTelefone());

        System.out.println("\nDADOS DA EMPRESA\n");
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ da empresa: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getTelefone());

        sc.close();
    }
}
