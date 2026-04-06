package com.encapsulamento.models;

final public class Carro extends Veiculo {
    private boolean bagageiro;

    public Carro(boolean bagageiro, String fabricante, String modelo, String cor, String ano, String placa) {
        super(fabricante, modelo, cor, ano, placa);
        this.bagageiro = bagageiro;
    }

    public boolean getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }
    

}
