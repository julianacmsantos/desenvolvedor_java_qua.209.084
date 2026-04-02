package com.encapsulamento.models;

final public class Carro extends Veiculo {
    private String bagageiro;

    public Carro(String bagageiro, String fabricante, String modelo, String cor, String ano, String placa, String categoria) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.bagageiro = bagageiro;
    }
    

    public String getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(String bagageiro) {
        this.bagageiro = bagageiro;
    }
    

}
