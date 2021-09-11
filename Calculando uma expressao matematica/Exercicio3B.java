// Exercicio 3B - calcular a expressao: d= (r + s) / 2, sendo que r= (a + b)² e s= (b + c)² com a classe JOptionPane
// 1 - receber o valor de a, b e c informado pelo usuario
// 2 - fazer o processamento para descobrir qual é o valor de d, para isso vamos precisar do metodo Math.pow que retorna a base elevada ao expoente
// 3 - exibir ao usuário o resultado de d conforme os valores de entrada informado

import javax.swing.JOptionPane;

public class Exercicio3B {
    public static void main (String args []){

        //entrada
        double a = Double.parseDouble(JOptionPane.showInputDialog("Usuario, digite o valor de a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Usuario, digite o valor de b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Usuario, digite o valor de c:"));

        //processamento
        double r = Math.pow(a + b, 2);
        double s = Math.pow(b + c, 2);
        double d = (r + s)/ 2;

        //saida
        JOptionPane.showMessageDialog(null, "Usuario, o valo de de d eh: " + d);
    }
}
