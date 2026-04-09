package com.banco.models;

import com.banco.repository.IConta;

abstract public class Conta {
    private String agencia;
    private String conta;

    public Conta(String agencia, String conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return this.conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }


}
