package com.banco.repository;

public interface IConta {
    public void exibirDados();
    public double fazerDeposito(double valor);
    public double fazerSaque(double valor);
}
