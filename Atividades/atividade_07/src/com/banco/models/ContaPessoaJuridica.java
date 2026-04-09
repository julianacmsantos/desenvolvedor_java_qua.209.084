package com.banco.models;

public class ContaPessoaJuridica extends Conta {
    private PessoaJuridica pessoaJuridica;

    public ContaPessoaJuridica(PessoaJuridica pessoaJuridica, String conta, String agencia) {
        super(conta, agencia);
        this.pessoaJuridica = pessoaJuridica;
    }


}
