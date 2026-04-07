package com.encapsulamento.models;

final public class Caminhao extends Veiculo {
    private boolean carroceria;


    public Caminhao(boolean carroceria, String fabricante, String modelo, String cor, String ano, String placa) {
        super(fabricante, modelo, cor, ano, placa);
        this.carroceria = carroceria;
    }

    public boolean isCarroceria() {
        return this.carroceria;
    }
    
    public boolean getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(boolean carroceria) {
        this.carroceria = carroceria;
    }



}
