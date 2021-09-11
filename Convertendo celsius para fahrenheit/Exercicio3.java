//ler uma temperatura em graus Celsius
//Converter para graus Fahrenheit usando a formula f = 9/5*c + 32
//exibir resultado

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String args []){

        //entrada
        Scanner input = new Scanner (System.in);
        System.out.print("Insira a temperatura (Celsius): ");
        double temperaturaCelsius = input.nextDouble();

        //processamento
        double temperaturaFahrenheit = (temperaturaCelsius * 9.0/5.0) + 32.0;

        //saida
        System.out.println("A conversao da temperatura inserida em Celsius para Fahrenheit eh: " + temperaturaFahrenheit);

        //encerramento
        input.close();
    }
}