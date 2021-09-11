import java.util.Scanner;

// exercicio 2 - ler uma distancia em metros e converte-la para km

public class Exercicio2 {
    public static void main (String args []){

        //entrada
        Scanner input = new Scanner (System.in);
        System.out.print("Informe a distancia em metros: ");
        double distanciaMetros = input.nextDouble();

        //processamento
        double distanciaKm = distanciaMetros / 1000;

        //saida
        System.out.print("A distancia digitada em metros corresponde a: " + distanciaKm + " Km");

        //encerramento
        input.close();
    }
}
