// Exercicio 4B - calcular a media aritmetica entre 3 valores inseridos pelo usuario com a classe JOptionPane
// 1 - receber o valor de a, b e c informado pelo usuario
// 2 - fazer o processamento para descobrir qual é a media aritmetica dos 3 valores informados pelo usuario
// 3 - exibir ao usuário o resultado da media aritmetica dos 3 valores informados pelo usuario

import javax.swing.JOptionPane;

public class Exercicio4B{
    public static void main (String args []){
        
        //entrada
        double a = Double.parseDouble(JOptionPane.showInputDialog("Usuario, digite o valor de a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Usuario, digite o valor de b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Usuario, digite o valor de c:"));

        //processamento
        double media = (a + b + c)/3;

        //saida
        JOptionPane.showMessageDialog(null, "Usuario, a media dos valores inseridos eh: " + media);
    }
}