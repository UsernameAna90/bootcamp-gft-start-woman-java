package herancapolimorfismo;
/*
 * Criar classes funcionario, gerente e faxineiro
 * Realizar upcast e downcast
 */
public class HerancaPolimorfismo {
    public static void main(String[] args) {
        //Downcast
        Funcionario g1 = new Gerente("Sebastian", 25, 12345678910L, 5000.00D);

        //g1.status();
        //g1.fazerAniversario();
        //g1.status();

        //Upcast
        //Faxineiro f2 = (Faxineiro) new Funcionario("Alice", 25, 12345678912L, 1300);
        //f2.status();

        //Utilizando indiretamente o metodo sobrescrito (comportamento polimorfico)
        Funcionario[] funcionarios = new Funcionario[]{
           new Gerente("Artemis", 26, 12345678911L, 4500),
           new Faxineiro("Hector", 22, 1234568913L, 1200)
        };
        for (Funcionario f : funcionarios) {
            f.status();
        }

        //Utilizando diretamente o metodo sobrescrito
        Faxineiro f1 = new Faxineiro("Ana", 22, 12345678914L, 1100);
        f1.status();
    }
}
