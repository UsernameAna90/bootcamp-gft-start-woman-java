package operadoresrelacionais;

public class OperadoresRelacionais {
    public static void main(String[] argas) {
        /*
         * Realizar comparações entre diferentes operandos
         * utilizado operadores relacionais
         */
        int i1 = 10;
        int i2 =20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(i1 + " maior que " + i2 + " = " + (i1 > i2));
        System.out.println(i1 + " menor que " + i2 + " = " + (i1 < i2));
        System.out.println(f1 + " maior ou igual a " + f2 + " = " + (f1 >= f2));
        System.out.println(f1 + " menor ou igual a " + f2 + " = " + (f1 <= f2));
        System.out.println(c1 + " maior ou igual a " + c2 + " = " + (c1 >= c2));
        System.out.println(c1 + " igual a " + c2 + " = " + (c1 == c2));
        System.out.println(s1 + " igual a " + s2 + " = " + (s1 == s2));

        /* Comparações erradas
         * Certos operando não podem ser comparados, gerando erro sintático ou semântico,
         *quando a mensagem de erro não aparece na tela mas a comparação não faz sentido
         */
        //System.out.println(s1 + " maior ou igual a " + s2 + " = " + (s1 > s2)); * Erro sintático
        //System.out.println(b1 + " maior que " + b2 + " = " + (b1 > b2)); * Erro sintático
        //System.out.println(f1 + " maior ou igual a " + c2 + " = " + (f1 >= c2)); * Erro semântico
        //System.out.println(f1 + " maior ou igual a " + s2 + " = " + (f1 >= s2)); * Erro sintático
    }
}
