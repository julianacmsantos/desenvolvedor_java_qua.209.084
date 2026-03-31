import java.util.Scanner;

import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa usuario = new Pessoa(null, null, null, null, 0, 0);

        System.out.println("Informe o nome:");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o e-mail:");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone:");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe o cpf");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = sc.nextInt();
        System.out.println("Informe a altura:");
        usuario.altura = sc.nextDouble();

        System.out.println("Nome: " + usuario.nome);
        System.out.println("E-mail: " + usuario.email);
        System.out.println("Telefone: " + usuario.telefone);
        System.out.println("Cpf: " + usuario.cpf);
        System.out.println("Idade: " + usuario.idade);
        System.out.println("Altura: " + usuario.altura);

        sc.close();
    }
}
