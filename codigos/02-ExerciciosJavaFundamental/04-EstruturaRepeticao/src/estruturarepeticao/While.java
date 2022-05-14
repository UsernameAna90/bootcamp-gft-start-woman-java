package estruturarepeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia conjuntos de dois valores,
         * sendo um deles o nome, e o outro a idade.
         * Pare a repetição quando o usuário digitar "0".
         */
        Scanner scan = new Scanner(System.in);
        int i = 1;
        String nome;
        int idade;

        while (i != 0) {
            System.out.print("Nome: ");
            nome = scan.next();
            System.out.print("Idade: ");
            idade = scan.nextInt();
            System.out.println("Digite 0 para sair!");
            i = scan.nextInt();
            System.out.println("_________________________________");
        }
        System.out.println("Programa finalizado!");
    }
}
