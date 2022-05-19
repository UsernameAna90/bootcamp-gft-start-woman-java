package excecoesunchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecoesUnchecked {
    public static void main(String[] args) {
        //Aplicando tratamento de excecoes
        Scanner scan = new Scanner(System.in);
        double n1;
        double n2;

        while (true) {
            try {
                System.out.print("Primeiro valor: ");
                n1 = Double.parseDouble(scan.next());
                System.out.print("Segundo valor: ");
                n2 = Double.parseDouble(scan.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage()+"\nValor inválido! Insira novamente.");
                System.out.println("---------------------------------");
            }
        }
        double resultadoDivisao = divisao(n1, n2);
        System.out.println(n1 +" dividido por "+n2+" = "+resultadoDivisao);
    }

    static double divisao(double n1, double n2) { return n1 / n2; }
}

