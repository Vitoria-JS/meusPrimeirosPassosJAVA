// Exercicio 2B - calcular a area, perimetro e diagonal de um quadrado com a classe JOptionPane
// 1 - receber a medida do lado do quadrado informado pelo usuario
// 2 - fazer o processamento para descobrir qual é a area, perimetro e diagonal do quadrado. Para o calculo vamos precisar do metodo Math.sqrt que retorna a raiz quadrada do numero
// 3 - exibir ao usuário o resultado da area, perimetro e diagonal do quadrado conforme o numero informado

import javax.swing.JOptionPane;

public class Exercicio2B {
    public static void main (String args []){

        //entrada
        double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Usuario, digite a medida do lado do quadrado em cm:"));

        //processamento
        double area = lado * lado;
        double perimetro = lado * 4;
        double diagonal = lado * Math.sqrt(2);

        //saida
        JOptionPane.showMessageDialog(null, "Usuario, a area do seu quadrado eh: " + area + "cm\nO perimetro do seu quadrado eh: " + perimetro + "cm e\nA diagonal do seu quadrado eh: " + diagonal + "cm");
    }
}