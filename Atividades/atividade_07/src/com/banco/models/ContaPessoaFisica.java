package com.banco.models;

public class ContaPessoaFisica extends Conta {
    private PessoaFisica pessoaFisica;

    public ContaPessoaFisica(PessoaFisica pessoaFisica, String conta, String email) {
        super(conta, email);
        this.pessoaFisica = pessoaFisica;
    }


}
