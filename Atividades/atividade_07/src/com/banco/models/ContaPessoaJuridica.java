package com.banco.models;

public class ContaPessoaJuridica extends Conta {
    private PessoaJuridica pessoaJuridica;

    public ContaPessoaJuridica(PessoaJuridica pessoaJuridica, String conta, String agencia, double saldo) {
        super(conta, agencia, saldo);
        this.pessoaJuridica = pessoaJuridica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return this.pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public void exibirDados() {
        System.out.println("Razão social da empresa: " + this.pessoaJuridica.getRazaoSocial());
        System.out.println("Nome Fantasia da empresa: " + this.pessoaJuridica.getNomeFantasia());
        System.out.println("CNPJ da empresa: " + this.pessoaJuridica.getCnpj());
        System.out.println("E-mail da empresa: " + this.pessoaJuridica.getEmail());
        super.exibirDados();
    }

    public double fazerSaque(double valor) {
        this.setSaldo(this.getSaldo() - valor - (this.getSaldo() - 0.01/100));
        return getSaldo();
    }
}
