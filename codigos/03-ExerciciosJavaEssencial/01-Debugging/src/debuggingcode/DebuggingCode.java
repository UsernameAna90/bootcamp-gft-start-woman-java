package debuggingcode;

import java.util.Scanner;

public class DebuggingCode {
    public static void main(String[] args) {
        /*
         * Calculadora de médias das notas de determinados alunos
         * Classe para teste de debugging
         */

        //Vetor com os nomes dos alunos
        String[] alunos = {"Ana", "Sebastian", "Artemis", "Alice"};
        //Objeto para entrada de dados
        Scanner scan = new Scanner(System.in);
        //Chamando metodo e armazenando resultado
        int media = calcularMedia(alunos, scan);

        System.out.println("Media das notas: "+media);
    }

    static int calcularMedia(String[] alunos, Scanner input) {
        int soma = 0;

        //Recebendo e somando notas
        for (String nome : alunos) {
            System.out.print("Insira nota do(a) "+nome+": ");
            soma += input.nextInt();
        }

        //Retornando media
        return soma / alunos.length;
    }
}
