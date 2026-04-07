package com.encapsulamento.models;

final public class Moto extends Veiculo {

    private String cilindradas;
    
    public Moto(String fabricante, String modelo, String cor, String ano, String placa, String cilindradas) {
        super(fabricante, modelo, cor, ano, placa);
        this.cilindradas = cilindradas;
    }    

    public String getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

}
