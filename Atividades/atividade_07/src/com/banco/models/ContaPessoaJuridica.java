package com.banco.models;

public class ContaPessoaJuridica extends Conta {
    private PessoaJuridica pessoaJuridica;
    private double taxa = 0.01;

    public ContaPessoaJuridica(PessoaJuridica pessoaJuridica, double taxa, String conta, String agencia, double saldo) {
        super(conta, agencia, saldo);
        this.pessoaJuridica = pessoaJuridica;
        this.taxa = taxa;
    }

    public PessoaJuridica getPessoaJuridica() {
        return this.pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void exibirDados() {
        System.out.println("Razão social da empresa: " + pessoaJuridica.getRazaoSocial());
        System.out.println("Nome Fantasia da empresa: " + pessoaJuridica.getNomeFantasia());
        System.out.println("CNPJ da empresa: " + pessoaJuridica.getCnpj());
        super.exibirDados();
    }
}
