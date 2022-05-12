package emprestimo;
/*
 * Calcular o valor final de um empréstimo, a partir de uma valor solicitado;
 * Taxas de juros e número parcelas influenciam no valor final;
 */
public class Emprestimo {
    public static void main(String[] args) {
        float valorEmprestimo = 3025.50f;
        float valorEmprestimo2 = 1500.90f;
        int numParcelas = 12;
        float jurosMes = 0.10f;

        //Empréstimo 1
        float total = calculo(valorEmprestimo, numParcelas, jurosMes);
        resultado(valorEmprestimo, total);

        //Empréstimo 2
        float total2 = calculo(valorEmprestimo2, numParcelas, jurosMes);
        resultado(valorEmprestimo2, total2);
    }

    public static float calculo(float valor, int parcelas, float juros) {
        /*
         * Recebe o valor solicitado, o número de parcelas e a taxa de juros.
         * Calcula e retorna o valor final do empréstimo.
         */
        float valorFinal = (((valor / parcelas) * juros) * parcelas + valor);
        return valorFinal;
    }

    public static void resultado(float valor, float total) {
        //Imprime o valor solicitado e o valor final.
        System.out.println("Valor do empréstimo: "+valor);
        System.out.println("Valor total final: "+total);
        System.out.println("----------------------------");
    }
}
