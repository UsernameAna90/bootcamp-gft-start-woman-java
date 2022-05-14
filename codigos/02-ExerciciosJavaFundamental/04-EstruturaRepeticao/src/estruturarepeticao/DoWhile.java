package estruturarepeticao;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
         * Faça um programa que peça uma nota de 0 a 10.
         * Imprima "nota inválida"
         * enquanto a nota inserida não estiver no intervalo solicitado.
         */
        int nota;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Nota (0 - 10): ");
            nota = scan.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Sua nota: " + nota);
    }
}
