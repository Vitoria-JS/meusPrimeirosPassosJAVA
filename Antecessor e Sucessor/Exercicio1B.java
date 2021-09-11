// Exercicio 1A - mostrar o sucessor e antecessor de um numero qualquer com a classe JOptionPane
// 1 - receber um numero inteiro qualquer informado pelo usuario
// 2 - fazer o processamento para descobrir qual é o sucessor e antecessor do numero informado pelo usuario
// 3 - exibir ao usuário qual é o numero que sucede e antecede o numero informado

import javax.swing.JOptionPane;

public class Exercicio1B {
    public static void main (String args []){

        //entrada
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Usuario, informe um numero inteiro: "));

        //processamento
        int sucessor = n + 1;
        int antecessor = n - 1;

        //saida
        JOptionPane.showMessageDialog(null, "Usuario, o sucessor do numero informado eh: " + sucessor + " e o antecessor: " + antecessor);

    }
}
