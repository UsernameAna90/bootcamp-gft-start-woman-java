package execaocustomizada;

import javax.swing.*;

public class ExcecaoCustomizada {
    public static void main(String[] args) {
        int[] numeradores = {4, 5, 9, 3};
        int[] denominadores = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominadores.length; i++ ) {
            try {
                if (numeradores[i] % 2 != 0) {
                    throw new divisaoNaoExataException("Divisão não exata!", numeradores[i], denominadores[i]);
                }

                int resultado = numeradores[i] / denominadores[i];
                System.out.println(resultado);
                
            } catch (divisaoNaoExataException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Índice fora de alcance!");
            }
        }
        System.out.println("O programa continua...");
    }
}

class divisaoNaoExataException extends Exception {
    //Criando excecao customizada

    //Atributos
    private int numerador;
    private int denominador;

    //Construtor

    public divisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}

