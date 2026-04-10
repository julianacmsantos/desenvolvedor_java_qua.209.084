package com.banco.models;

public class PessoaJuridica extends Pessoa {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica(String nomeFantasia, String razaoSocial, String cnpj, String email) {
        super(email);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void exibirDados() {
        System.out.println("Razão Social da empresa: " + this.razaoSocial);
        System.out.println("Nome Fantasia da empresa: " + this.nomeFantasia);
        System.out.println("CNPJ da empresa: " + this.cnpj);
        System.out.println("E-mail da empresa: " + this.getEmail());
    }
}
