package operadores;

public class Operadores {
    public static void main(String[] args) {
        //Criar operações com os tipos de operadores apresentados

        //Operadores de atribuição:
        int n1 = 500;
        int n2 = 4;
        int n3 = 100;
        System.out.println(n1 + " " + n2);

        n1 += n3;
        n2 -= n3;
        System.out.println(n1 + " " + n2);

        n1 /= n3;
        n3 %= n1;
        System.out.println(n1 + " " + n3);

        //Operadores aritmeticos:
        System.out.println("Soma: " + (n1 + n3));
        System.out.println("Subtração: " + (n1 - n3));
        System.out.println("Multiplicação: " + (n1 * n3));
        System.out.println("Divisão: " + (n1 / n3));
        System.out.println("Resto da divisão: " + (n1 % n3));

        //Operadores pre-fixados
        int x = 100;
        int a = --x;
        x = 100;
        int b = ++x;
        System.out.println(a + " " + b);

        //Operadores pós-fixados
        x = 100;
        a = x--;
        x = 100;
        b = x++;
        System.out.println(a + " " + b);
    }
}
