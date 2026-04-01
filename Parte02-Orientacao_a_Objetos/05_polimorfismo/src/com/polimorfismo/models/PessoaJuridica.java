package com.polimorfismo.models;

// pode ser instanciada, porem nao pode gerar subclasses
final public class PessoaJuridica extends Pessoa {

    public String nomeFantasia;
    public String cnpj;
    
    // o construtor precisa trazer os atributos da classe mae
    public PessoaJuridica(String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;        
    }

    // polimorfismo: utiliza o metodo da classe mae, porem modificado
    public void exibirDados() {
        System.out.println("Nome da empresa: " + this.nomeFantasia);
        System.out.println("CNPJ da empresa: " + this.cnpj);
        super.exibirDados();
    }  
}
