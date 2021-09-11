// Exercicio 5B - simular o funcionamento de um caixa eletronico com a classe JOptionPane
// 1 - receber o valor de saque informado pelo usuario
// 2 - fazer o processamento para descobrir quantas notas de cada valor disponivel o usuario irá sacar (A prioridade é que o usuário saque a menor quantidade de notas possivel)
// 3 - exibir ao usuário quantas notas de cada valor ele irá receber.

import javax.swing.JOptionPane;

public class Exercicio5B {
    public static void main (String args []){

        //entrada
        int saque = Integer.parseInt(JOptionPane.showInputDialog(null, "Usuario, insira o valor de saque: ", "notas disponiveis: 50, 20, 10, 5, 2 e 1", JOptionPane.INFORMATION_MESSAGE));

        //processamento
        int notas50 = saque / 50;
        int resto = saque % 50;

        int notas20 = resto / 20;
        resto = resto % 20;

        int notas10 = resto / 10;
        resto = resto % 10;

        int notas5 = resto / 5;
        resto = resto % 5;

        int notas2 = resto / 2;
        resto = resto % 2;

        int notas1 = resto % 1;

        //saida
        JOptionPane.showMessageDialog(null, "Usuario, voce ira retirar:\n" + notas50 + " notas de 50\n" + notas20 + " notas de 20\n" + notas10 + " notas de 10\n" 
        + notas5 + " notas de 5\n" + notas2 + " notas de 2\n" + notas1 + " notas de 1.");
    }
}
