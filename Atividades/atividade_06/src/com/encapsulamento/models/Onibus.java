package com.encapsulamento.models;

final public class Onibus extends Veiculo {
    private boolean leito;

    public Onibus(boolean leito, String fabricante, String modelo, String cor, String ano, String placa) {
        super(fabricante, modelo, cor, ano, placa);
        this.leito = leito;
    }

    public boolean isLeito() {
        return this.leito;
    }
    
    public boolean getLeito() {
        return this.leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }


}
