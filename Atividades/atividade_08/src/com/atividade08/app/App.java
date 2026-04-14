package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // TO DO

        // Crie um programa que recebe do usuário os valores dos atributos nome e idade em JOptionPane,
        // e o programa informa se o usuário é maior ou menor de idade

        Pessoa pessoa = new Pessoa(null, 0);

         pessoa.setNome(JOptionPane.showInputDialog("Informe o nome:"));
         pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));

         if (pessoa.getIdade() < 18) {
            JOptionPane.showMessageDialog(null, "Pessoa menor de idade");
         } else {
            JOptionPane.showMessageDialog(null, "Pessoa maior de idade");
         }

    }
}
