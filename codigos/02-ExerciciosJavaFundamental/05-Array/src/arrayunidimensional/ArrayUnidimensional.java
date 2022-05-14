package arrayunidimensional;

import java.util.Scanner;

public class ArrayUnidimensional {
    public static void main(String[] args) {
        /*
         * Crie um vetor de seis valores inteiros.
         * Imprima-os na ordem inversa
         */
        int[] valores = new int[6];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            valores[i] = scan.nextInt();
        }

        System.out.println("Imprimindo o vetor na ordem inversa!");

        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}
