import dadosclientes.Cliente;
import dadosclientes.Endereco;
import funcionalidadesbanco.ContaCorrente;
import funcionalidadesbanco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(15, "conta corrente");
        Endereco e1 = new Endereco(15, 309, "Elias José", "João Batista", "Centralina", "Minas Gerais");
        Cliente c1 = new Cliente(15, "Ana", 22, "14264599636", "ana.andrade@gmail.com", 1200, e1, cc1);

        c1.atualizarDados(5, "1500");
        System.out.println(c1.visualizarDados());
    }
}
