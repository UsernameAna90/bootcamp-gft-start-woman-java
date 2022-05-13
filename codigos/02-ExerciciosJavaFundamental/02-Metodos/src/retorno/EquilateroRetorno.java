package retorno;
/*
 * Replicar classe de sobrecarga, retornando os resultados ao invés de imprimi-los.
 */
public class EquilateroRetorno {
    public static float area(float lado) {
        //Calcula a área de um quadrado
        return lado * lado;
    }

    public static float area(float base, float altura) {
        //Calcula a área de um retângulo
        return base * altura;
    }

    public static float area(float base1, float base2,float altura) {
        //Calcula a área de um trapézio
        return ((base1 + base2) * altura) / 2;
    }
}
