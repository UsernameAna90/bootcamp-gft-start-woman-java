package calculadora;
/*
 * Criar uma calculadora que efetue as quatro operações aritméticas básicas;
 * Deve receber sempre dois parâmetros;
 */
public class Calculadora {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        //Chamando métodos para efetuar as operações aritméticas básicas com n1 e n2.
        Calculadora.soma(n1, n2);
        Calculadora.subtracao(n1, n2);
        Calculadora.multiplicacao(n1, n2);
        Calculadora.divisao(n1, n2);
    }

    public static void soma(int n1, int n2) {
        //Calcula a soma entre os dois valores, e imprime o resultado na tela.
        int resultadoSoma = n1 + n2;
        System.out.println("A soma de "+n1+" e "+n2+" é igual a "+resultadoSoma+"!");
    }

    public static void subtracao(int n1, int n2) {
        //Calcula a diferença entre os dois valores, e imprime o resultado na tela.
        int resultadoSubt = n1 - n2;
        System.out.println("A subtração de "+n1+" e "+n2+" é igual a "+resultadoSubt+"!");
    }

    public static void multiplicacao(int n1, int n2) {
        //Calcula a multiplicação entre os dois valores, e imprime o resultado na tela.
        int resultadoMult = n1 * n2;
        System.out.println("A multiplicação de "+n1+" e "+n2+" é igual a "+resultadoMult+"!");
    }

    public static void divisao(int n1, int n2) {
        //Calcula a divisão entre os dois valores, e imprime o resultado na tela.
        float resultadoDivi = (float)n1 / (float)n2;
        System.out.println("A divisão de "+n1+" e "+n2+" é igual a "+resultadoDivi+"!");
    }
}
