package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
         * Faca um programa que receba a temperatura média dos 6 primeiros meses do ano
         * Armazene-as em uma lista
         * Calcule a media semestral das mesmas
         * Imprima as temperaturas acima da media e em que mes ocorreram
         */

        //Scanner para ler as temperaturas inseridas
        Scanner scan = new Scanner(System.in);
        //Lista vazia para armazenar as temperaturas inseridas
        List<Double> temperatura = new ArrayList<>();
        //Lista com os nomes dos meses do primeiro semestre do ano
        List<String> meses = new ArrayList<>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"));
        //Armazena as temperaturas inseridas
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            //Solicitando temperaturas
            System.out.print("Temperatura de " + meses.get(i) + ": ");
            temperatura.add(scan.nextDouble());

            //Somando as temperaturas
            soma += temperatura.get(i);
        }

        //Calculando a media entre as temperaturas
        double me = soma / temperatura.size();

        System.out.println("_________________________________________");
        System.out.println("Temperatura media: " + me);
        System.out.println("Meses com temperatura acima da media: ");

        for (int i = 0; i < 6; i++) {
            //Imprimindo temperaturas acima da media
            if (temperatura.get(i) > me) {
                System.out.println(meses.get(i) + ": " + temperatura.get(i));
            }
        }
    }
}
