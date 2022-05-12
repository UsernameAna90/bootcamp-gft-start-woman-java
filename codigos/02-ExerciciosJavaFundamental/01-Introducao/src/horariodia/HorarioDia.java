package horariodia;
/*
 * A partir do horário do dia informado, imprimir "bom dia, boa tarde ou boa noite";
 */
public class HorarioDia {
    public static void main(String[] args) {
        int h = 8;
        int h2 = 15;

        //Chamando o método
        cumprimentacao(h);
        cumprimentacao(h2);
    }

    public static void cumprimentacao(int horario) {
        /*
         * Recebe um horário como parâmetro;
         * Imprime o horário na tela, e um cumprimento de acordo com o mesmo.
         */
        System.out.print("São " +horario+" horas! ");
        switch (horario) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Boa madrigada!");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Bom dia!");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("Boa tarde!");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Horário inválido!");
        }
    }
}
