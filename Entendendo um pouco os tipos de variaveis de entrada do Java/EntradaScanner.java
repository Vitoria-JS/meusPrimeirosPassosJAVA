import java.util.Scanner;

public class EntradaScanner{
    public static void main (String args[]){

        //instanciando a classe Scanner
        Scanner input = new Scanner(System.in);

        //entrada int
        System.out.print("digite um numero inteiro: ");
        int a = input.nextInt();

        //saida int
        System.out.println("voce digitou o numero: " + a);

        //entrada double
        System.out.print("digite um numero de ponto flutuante: ");
        double x = input.nextDouble();

        //saida double
        System.out.println("voce digitou o numero: " + x);

        //entrada boolean
        System.out.print("digite um numero verdadeiro (true) ou falso (false): ");
        boolean opcao = input.nextBoolean();

        //saida boolean
        System.out.println("voce digitou o booleano: " + opcao);

        //entrada String
        System.out.print("digite uma palavra: ");
        String palavra = input.next();

        //saida String
        System.out.println("voce digitou a palavra: " + palavra);

        //entrada String descartando enters
        System.out.print("digite uma frase: ");
        input.nextLine(); //aqui descartamos todos os "enters"
        String frase = input.nextLine();

        //saida String descartando enters
        System.out.println("voce digitou a frase: " + frase);

        //encerramento
        input.close();
    }
}