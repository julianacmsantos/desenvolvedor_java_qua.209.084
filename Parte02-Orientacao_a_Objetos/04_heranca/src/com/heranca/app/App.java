package com.heranca.app;

import java.util.Scanner;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // dados da empresa
        empresa.razaoSocial = "Juliana LTDA";
        empresa.nomeFantasia = "Serviços web";
        empresa.cnpj = "51.438.999/0001-96";
        empresa.email = "servicosweb@email.com";
        empresa.telefone = "99556-4511";
        empresa.endereco = "SCS 125 Lote 02"; 
        empresa.website = "www.servicosweb.com";

        // dados do usuario
        System.out.println("DADOS DO USUÁRIO:");
        System.out.println("Informe o nome do usuário:");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o CPF do usuário:");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o e-mail do usuário:");
        usuario.email = sc.nextLine();
        System.out.println("Informe o endereço do usuário:");
        usuario.endereco = sc.nextLine();
        System.out.println("Informe o telefone do usuário:");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe a idade do usuário:");
        usuario.idade = sc.nextInt();

        // saida de dados
        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));        

        sc.close();
    }
}
