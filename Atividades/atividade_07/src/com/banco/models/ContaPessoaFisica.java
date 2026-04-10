package com.banco.models;

public class ContaPessoaFisica extends Conta {
    private PessoaFisica pessoaFisica;

    public ContaPessoaFisica(PessoaFisica pessoaFisica, String agencia, String conta, double saldo) {
        super(agencia, conta, saldo);
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaFisica getPessoaFisica() {
        return this.pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public void exibirDados() {
        System.out.println("Nome do titular: " + this.pessoaFisica.getNome());
        System.out.println("CPF do titular: " + this.pessoaFisica.getCpf());
        System.out.println("E-mail do titular: " + this.pessoaFisica.getEmail());
        super.exibirDados();
    }

}
