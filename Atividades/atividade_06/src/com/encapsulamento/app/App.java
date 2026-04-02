package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.*;

public class App {
    public static void main(String[] args) throws Exception {
        /*TODO 
        A partir da superclasse abstrata Veiculo, crie as subclasses finais:
        Moto, Carro, Onibus e Caminhao, todas no package Models
        Instancie cada uma das subclasses na classe principal, e peça para o usuário informar
        os seguintes atributos privados de um veículo escolhido pelo próprio usuário:
        fabricante, modelo, cor, ano, placa
        O atributo privado categoria deverá ser informado pelo próprio programa
        Diferenças entre as classes:
        Carro -> bagageiro / Ônibus -> leito ou não / Caminhão -> carroceria
        Ao final, o programa exibirá os dados do veículo escolhido por ele
        NOTE: utilize Herança, Abstração e Encapsulamento para codar
        NOTE: divirtam-se        
        */ 

        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();

        System.out.println("Escolha um dos veículos listados abaixo:");
        System.out.println("01 - Caminhão");
        System.out.println("02 - Carro");
        System.out.println("03 - Moto");
        System.out.println("04 - Ônibus");

        veiculo.setCategoria(sc.nextLine());

        switch()



        sc.close();
    }
}
