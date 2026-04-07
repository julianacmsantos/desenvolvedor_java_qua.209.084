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

        System.out.println("Escolha um dos veículos listados abaixo:");
        System.out.println("1 - Caminhão");
        System.out.println("2 - Carro");
        System.out.println("3 - Moto");
        System.out.println("4 - Ônibus");

        String categoria = sc.nextLine();

        switch(categoria) {
            case "1":
                Caminhao caminhao = new Caminhao(true, null, null, null, null, null);
                System.out.println("\nCAMINHÃO");
                System.out.println("\nInforme o fabricante:");
                caminhao.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                caminhao.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                caminhao.setCor(sc.nextLine());
                System.out.println("Informe o ano:");
                caminhao.setAno(sc.nextLine());
                System.out.println("Informe a placa:");
                caminhao.setPlaca(sc.nextLine());

                System.out.println("\nDADOS DO CAMINHÃO \n Fabricante: " + caminhao.getFabricante() + "\n Modelo: " + caminhao.getModelo() + "\n Cor: " + caminhao.getCor() + "\n Ano: " + caminhao.getAno() + "\n Placa: " + caminhao.getPlaca() + "\n Carroceria: " + (caminhao.getCarroceria() ? "sim" : "não"));

                break;
            case "2":
                Carro carro = new Carro(true, null, null, null, null, null);
                System.out.println("\nCARRO");
                System.out.println("\nInforme o fabricante:");
                carro.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                carro.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                carro.setCor(sc.nextLine());
                System.out.println("Informe o ano:");
                carro.setAno(sc.nextLine());
                System.out.println("Informe a placa:");
                carro.setPlaca(sc.nextLine());

                System.out.println("\nDADOS DO CARRO \n Fabricante: " + carro.getFabricante() + "\n Modelo: " + carro.getModelo() + "\n Cor: " + carro.getCor() + "\n Ano: " + carro.getAno() + "\n Placa: " + carro.getPlaca() + "\n Bagageiro: " + (carro.getBagageiro() ? "sim" : "não"));

                break;
            case "3":
                Moto moto = new Moto(null, null, null, null, null, null);
                System.out.println("\nMOTO");
                System.out.println("\nInforme o fabricante:");
                moto.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                moto.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                moto.setCor(sc.nextLine());
                System.out.println("Informe o ano:");
                moto.setAno(sc.nextLine());
                System.out.println("Informe a placa:");
                moto.setPlaca(sc.nextLine());
                System.out.println("Informe as cilindradas:");
                moto.setCilindradas(sc.nextLine());

                System.out.println("\nDADOS DA MOTO \n Fabricante: " + moto.getFabricante() + "\n Modelo: " + moto.getModelo() + "\n Cor: " + moto.getCor() + "\n Ano: " + moto.getAno() + "\n Placa: " + moto.getPlaca() + "\n Cilindradas: " + moto.getCilindradas());

                break;
            case "4":
                Onibus onibus = new Onibus(true, null, null, null, null, null);
                System.out.println("\nÔNIBUS");
                System.out.println("\nInforme o fabricante:");
                onibus.setFabricante(sc.nextLine());
                System.out.println("Informe o modelo:");
                onibus.setModelo(sc.nextLine());
                System.out.println("Informe a cor:");
                onibus.setCor(sc.nextLine());
                System.out.println("Informe o ano:");
                onibus.setAno(sc.nextLine());
                System.out.println("Informe a placa:");
                onibus.setPlaca(sc.nextLine());

                System.out.println("\nDADOS DO ÔNIBUS \n Fabricante: " + onibus.getFabricante() + "\n Modelo: " + onibus.getModelo() + "\n Cor: " + onibus.getCor() + "\n Ano: " + onibus.getAno() + "\n Placa: " + onibus.getPlaca() + "\n Leito: " + (onibus.getLeito() ? "sim" : "não"));

                break;
            default:
                System.out.println("Opção inválida");
                
        }


        sc.close();
    }
}
