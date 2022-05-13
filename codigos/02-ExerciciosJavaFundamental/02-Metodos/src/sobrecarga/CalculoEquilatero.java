package sobrecarga;
/*
 * Criar uma classe de sobrecarga, para calcular a área de diferentes quadriláteros.
 */
public class CalculoEquilatero {
    public static void area(float lado) {
        //Calcula a área de um quadrado
        System.out.println("Área do quadrado: " + (lado * lado));
    }

    public static void area(float base, float altura) {
        //Calcula a área de um retângulo
        System.out.println("Área do retangulo: " + (base * altura));
    }

    public static void area(float base1, float base2,float altura) {
        //Calcula a área de um trapézio
        System.out.println("Área do trapezio: " + ((base1 + base2) * altura) / 2);
    }
}
