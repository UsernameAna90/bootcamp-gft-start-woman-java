package funcionalidadesAuxiliares;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacao {
    //Criando um escaner para realizar a leitura de dados
    Scanner scan = new Scanner(System.in);

    public int lerInt(String pergunta) {
        //Valida entrada de dados do tipo "Long"
        while (true) {
            try {
                System.out.print(pergunta+": ");
                int dado = Integer.parseInt(scan.nextLine().trim());
                return dado;
            } catch (NumberFormatException e) {
                System.out.println("\nTipo de dado invalido! Tente novamente.");
            }
        }
    }

    public double lerDouble(String pergunta) {
        //Valida entrada de dados do tipo "double"
        while (true) {
            try {
                System.out.print(pergunta+": ");
                Double dado = Double.parseDouble(scan.nextLine().trim());
                return dado;
            } catch (NumberFormatException e) {
                System.out.println("\nTipo de dado invalido! Tente novamente.");
            }
        }
    }
    public String lerString(String pergunta) {
        //Valida entrada de dados do tipo "double"
        while (true) {
            try {
                System.out.print(pergunta + ": ");
                String dado = (scan.nextLine()).trim();
                return dado;
            } catch (InputMismatchException e) {
                System.out.println("\nTipo de dado invalido! Tente novamente.");
            }
        }
    }

    public int selecionarOpcao(String mensagem, Validacao validacao, int menorOp, int maiorOp) {
        //Retorna um ou dois deprendendo da entrada recebida. 1 para sim, 2 para nao.
        int resposta = -1; //Armazena a resposta

        //O loop se repete enquanto a resposta nao estiver entre o limite permitivo
        while (resposta < menorOp|resposta > maiorOp) {
            resposta = validacao.lerInt(mensagem); //Valida a entrada dos dados

            if (resposta < menorOp|resposta > maiorOp) { //Imprime mensagem de opcao invalida
                System.out.println("\nOpcao invalida! Tente novamente.");
            }
        }
        return resposta;
    }
}
