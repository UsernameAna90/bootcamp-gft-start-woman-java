package estruturarepeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        /*
         * Crie um laço que leia cinco numeros,
         * informe o maior deles
         * e a media entre eles.
         */
        int numero = 0;
        int contador = 0;
        int comparador = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numero = scan.nextInt();
            contador += numero;

            if (numero > comparador) {
                comparador = numero;
            }

        }
        System.out.println("O maior dos numeros digitados: " + comparador);
        System.out.println("A média dos numeros digitados: " + (float) contador / 5);
    }
}
