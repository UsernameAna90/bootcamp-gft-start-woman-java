package estruturacondicional;

public class SwitchCase01 {
    public static void main(String[] args) {
        //Com switch, a partir do nome do dia da semana, exibir o seu número
        String dia = "sexta";

        System.out.print("Hoje é " + dia + ". ");
        switch (dia) {
            case "domingo":
                System.out.println("Dia 1!");
                break;
            case "segunda":
                System.out.println("Dia 2!");
                break;
            case "terca":
                System.out.println("Dia 3!");
                break;
            case "quarta":
                System.out.println("Dia 4!");
                break;
            case "quinta":
                System.out.println("Dia 5!");
                break;
            case "sexta":
                System.out.println("Dia 6!");
                break;
            case "sabado":
                System.out.println("Dia 7!");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
}
