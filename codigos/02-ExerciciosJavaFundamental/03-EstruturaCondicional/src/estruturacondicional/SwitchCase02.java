package estruturacondicional;

public class SwitchCase02 {
    public static void main(String[] args) {
        /*
         * Se uma variável inteira estiver entre 1 e 3, imprimir "certo"
         * Se for 4, imprimir "errado"
         * Se for 5, imprimir "talvez"
         * Para demais valores, imprimir "indefinido"
         */
        int numero = 3;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo!");
                break;
            case 4:
                System.out.println("Errado!");
                break;
            case 5:
                System.out.println("Talvez!");
                break;
            default:
                System.out.println("Indefinido!");
                break;
        }
    }
}
