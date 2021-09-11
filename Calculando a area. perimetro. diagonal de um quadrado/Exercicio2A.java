// Exercicio 2A - calcular a area, perimetro e diagonal de um quadrado com a classe Scanner
// 1 - receber a medida do lado do quadrado informado pelo usuario
// 2 - fazer o processamento para descobrir qual é a area, perimetro e diagonal do quadrado. Para o calculo vamos precisar do metodo Math.sqrt que retorna a raiz quadrada do numero
// 3 - exibir ao usuário o resultado da area, perimetro e diagonal do quadrado conforme o numero informado

import java.util.Scanner;

public class Exercicio2A {
    public static void main (String Args []){

        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.print("Usuario, digite a medida do lado do quadrado em cm: ");
        double lado = entrada.nextDouble();

        //processamento
        double area = lado * lado;
        double perimetro = lado * 4;
        double diagonal = lado * Math.sqrt(2);

        //saida
        System.out.println("Usuario, a area do seu quadrado eh: " + area + "cm, o perimetro eh: " + perimetro + "cm e a diagonal do seu quadrado eh: " + diagonal + "cm");

        //liberar o espaço alocado em memória, necessário na classe Scanner quando se instancia um objeto que neste caso é a "entrada"
        entrada.close();
    }
}