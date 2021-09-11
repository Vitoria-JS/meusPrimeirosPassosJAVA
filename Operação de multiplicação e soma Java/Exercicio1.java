//Escrever um programa que pede 3 valores inteiros para o usuário
//multiplica o primeiro pela soma dos outros 2
//exibe o resultado final

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        //entrada
        Scanner input = new Scanner (System.in);

        System.out.print("Usuario, digite o valor 1 (inteiro): ");
        int inteiro1 = input.nextInt();

        System.out.print("Usuario, digite o valor 2 (inteiro): ");
        int inteiro2 = input.nextInt();

        System.out.print("Usuario, digite o valor 3 (inteiro): ");
        int inteiro3 = input.nextInt();

        //processamento
        int resultado = inteiro1 * (inteiro2 + inteiro3);

        //saida
        System.out.print("Usuario, o resultado da multiplicacaoo do valor 1 pela soma do valor 2 e 3 eh: " + resultado);

        //encerramento
        input.close();
    }
}