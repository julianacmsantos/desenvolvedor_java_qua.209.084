package com.polimorfismo.models;

// pode ser instanciada, porem nao pode gerar subclasses
final public class PessoaFisica extends Pessoa {

    public String nome;
    public String cpf;
    public int idade;
    
    // o construtor precisa trazer os atributos da classe mae
    public PessoaFisica(String nome, String cpf, int idade, String email, String telefone) {
        super(email, telefone);
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    // polimorfismo: utiliza o metodo da classe mae, porem modificado
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        super.exibirDados();
    }
}
