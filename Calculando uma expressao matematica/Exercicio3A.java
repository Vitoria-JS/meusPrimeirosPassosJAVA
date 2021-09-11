// Exercicio 3A - calcular a expressao: d= (r + s) / 2, sendo que r= (a + b)² e s= (b + c)² com a classe Scanner
// 1 - receber o valor de a, b e c informado pelo usuario
// 2 - fazer o processamento para descobrir qual é o valor de d, para isso vamos precisar do metodo Math.pow que retorna a base elevada ao expoente
// 3 - exibir ao usuário o resultado de d conforme os valores de entrada informado

import java.util.Scanner;

public class Exercicio3A {
    public static void main (String args []){

        //entrada
        Scanner entrada = new Scanner (System.in);

        System.out.print("Usuario, digite o valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Usuario, digite o valor de b: ");
        double b = entrada.nextDouble();

        System.out.print("Usuario, digite o valor de c: ");
        double c = entrada.nextDouble();

        //processamento
        double x1 = a + b;
        double x2 = b + c;
        double r = Math.pow(x1, 2);
        double s = Math.pow(x2, 2);
        double d = (r + s)/2;

        //saida
        System.out.println("Usuario, o valor de d eh: " + d);

        //liberar o espaço alocado em memória, necessário na classe Scanner quando se instancia um objeto que neste caso é a "entrada"
        entrada.close();
    }
}
