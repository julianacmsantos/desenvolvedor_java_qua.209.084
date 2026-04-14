package com.classe.app;

import javax.swing.JOptionPane;

import com.classe.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa(null, null, null, 0, 0.0);

        // input
        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em metros:").replace(",", ".")));
        pessoa.setCpf(JOptionPane.showInputDialog("Informe o CPF:"));
        pessoa.setEmail(JOptionPane.showInputDialog("Informe o e-mail:"));

        // output
        JOptionPane.showMessageDialog(null, 
            "Nome: " + pessoa.getNome() +
            "\nIdade: " + pessoa.getIdade() +
            "\nAltura: " + pessoa.getAltura() +
            "\nCPF: " + pessoa.getCpf() +
            "\nE-mail: " + pessoa.getEmail()
        );
       
    }
}
