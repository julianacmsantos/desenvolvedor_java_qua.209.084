package com.encapsulamento.models;

final public class PessoaJuridica extends Pessoa {
    // atributos
    // somente essa classe vai ter acesso aos atributos por serem private
    private String nomeFantasia;
    private String cnpj;


    public PessoaJuridica(String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    // metodos de acesso (getters e setters)
    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
