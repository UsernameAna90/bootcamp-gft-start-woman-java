package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args){
        /*
         * Faca um programa que faca cindo perguntas para uma pessoa sobre um crime
         * "Telefonou para a vitima?"
         * "Esteve no local do crime?"
         * "Mora perto da vitima?"
         * "Devia para a vitima?"
         * "Ja trabalhou com a vitima?"
         * Se houver:
         * Duas respostas positivas: Suspeita
         * Tres-quatro respostas positivas: Cumplice
         * Cinco resposta suspeitas: Culpada
         */

        //Lista com as perguntas
        List<String> perguntas = new ArrayList<>(Arrays.asList("Telefonou para a vitima?", "Esteve no local do crime?", "Mora perto da vitima?", "Devia para a vitima?", "Ja trabalhou com a vitima?"));
        //Scanner para ler respostas inseridas
        Scanner scan = new Scanner(System.in);
        //Armazena temporariamente respostas positivas
        String resposta = "";
        //Armazena quantidade de respostas positivas
        int sim = 0;

        System.out.println("---------- INTERROGATORIO ----------");

        for (int i = 0; i < perguntas.size(); i++) {
            //Realiza perguntas
            System.out.println(perguntas.get(i));
            //Le resposta
            resposta = scan.next();

            //Soma quantidade respostas positivas
            if (resposta.equals("sim")) {
                sim += 1;
            }
        }

        //Imprime o resultado de acordo com a quantidade de respostas positivas
        System.out.print("----------------------------------\nResultado: ");
        if (sim == 2) {
            System.out.print("SUSPEITO!");
        } else if (sim > 2 && sim < 5) {
            System.out.print("CUMPLICE!");
        } else if (sim == 5) {
            System.out.print("CULPADO!");
        } else {
            System.out.print("INOCENTE!");
        }

    }
}