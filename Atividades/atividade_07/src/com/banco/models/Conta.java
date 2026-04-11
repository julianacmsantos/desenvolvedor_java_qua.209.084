package com.banco.models;

import com.banco.repository.IConta;

public abstract class Conta implements IConta {
    private String agencia;
    private String conta;
    private double saldo;

    public Conta(String agencia, String conta, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
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

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Número da agência: " + this.agencia);
        System.out.println("Número da conta: " + this.conta);
        System.out.println("Saldo: R$ " + this.saldo);        
    }

    @Override
    public double fazerDeposito(double valor) {
        return this.saldo += valor;
    }

    @Override
    public double fazerSaque(double valor) {
        return this.saldo -= valor;
    }


}
