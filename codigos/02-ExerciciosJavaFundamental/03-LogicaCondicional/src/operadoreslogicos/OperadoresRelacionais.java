package operadoreslogicos;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        /*
         * Realizar comparações entre diferentes expressões lógicas
         * utilizado operadores lógicos
         */
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 && b2); //Conjunção
        System.out.println(b3 || b4); //Disjunção
        System.out.println(b1 && b3); //Conjunção
        System.out.println(b4 ^ b3); //Disjunção exclusiva
        System.out.println(b1 ^ b3); //Disjunção exclusiva
        System.out.println(!b1); //Negação
        System.out.println((b1 || b4) && 3 > 2); //Experssão lógica
    }
}
