package com.metodos.models;

public class Professor {

    // atributos
    public String nome;
    public String disciplina;
    
    // métodos
    public String darBoasVindas() {
        return "Olá, meu nome é " + this.nome + " e dou aula de " + this.disciplina + ".";
    }

    public double areaQuadrilatero(double x, double y) {
        return x*y;

    }
}
