package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;

        // input
        nome = JOptionPane.showInputDialog("Informe seu nome:");

        // output
        JOptionPane.showMessageDialog(null, "Meu nome é " + nome);
    }
}
