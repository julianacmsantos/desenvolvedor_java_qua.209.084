package com.encapsulamento.models;

final public class Caminhao extends Veiculo {
    private String carroceria;


    public Caminhao(String carroceria, String fabricante, String modelo, String cor, String ano, String placa, String categoria) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.carroceria = carroceria;
    }

    public String getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }



}
