package estruturacondicional;

public class IfElse02 {
    public static void main(String[] args) {
        //Exiba se é mês de férias de acordo com o número do mês
        int mes = 10;
        boolean mesFerias = (mes == 7 || mes == 1 || mes == 12);
        boolean mesTrabalho = ((mes > 1 && mes < 7) || (mes > 7 && mes < 12));

        System.out.print("Mês " + mes + ". ");
        if (mesFerias) {
            System.out.println("Mês de férias!");
        } else if (mesTrabalho) {
            System.out.println("Mês de Trabalhar!");
        } else {
            System.out.println("Mês inválido!");
        }
    }
}
