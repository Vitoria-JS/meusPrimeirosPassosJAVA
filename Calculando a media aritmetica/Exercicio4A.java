// Exercicio 4A - calcular a media aritmetica entre 3 valores inseridos pelo usuario com a classe Scanner
// 1 - receber o valor de a, b e c informado pelo usuario
// 2 - fazer o processamento para descobrir qual é a media aritmetica dos 3 valores informados pelo usuario
// 3 - exibir ao usuário o resultado da media aritmetica dos 3 valores informados pelo usuario

import java.util.Scanner;

public class Exercicio4A {
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
        double media = (a + b + c)/3;

        //saida
        System.out.println("Usuario, a media dos numeros inseridos eh: " + media);

        //liberar o espaço alocado em memória, necessário na classe Scanner quando se instancia um objeto que neste caso é a "entrada"
        entrada.close();
    }
}
