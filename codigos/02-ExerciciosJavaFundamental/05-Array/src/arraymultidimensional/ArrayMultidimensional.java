package arraymultidimensional;

import java.util.Random;
import java.util.Scanner;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        /*
         * Gere e imprima uma matriz de ordem quatro com valores aleatórios
         * Imprima os valores da matriz.
         */
        Random rand = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(9);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
