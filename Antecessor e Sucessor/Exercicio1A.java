// Exercicio 1A - mostrar o sucessor e antecessor de um numero qualquer com a classe Scanner
// 1 - receber um numero inteiro qualquer informado pelo usuario
// 2 - fazer o processamento para descobrir qual é o sucessor e antecessor do numero informado pelo usuario
// 3 - exibir ao usuário qual é o numero que sucede e antecede o numero informado

import java.util.Scanner;

public class Exercicio1A {
    public static void main (String args []){

        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.print("Usuario, informe um numero inteiro: ");
        int n = entrada.nextInt();

        //processamento
        int sucessor = n + 1;
        int antecessor = n - 1;

        //saida
        System.out.println("Usuario, o sucessor do numero informado eh: " + sucessor + " e o antecessor: " + antecessor);

        //liberar o espaço alocado em memória, necessário na classe Scanner quando se instancia um objeto que neste caso é a "entrada"
        entrada.close();
    }
}
