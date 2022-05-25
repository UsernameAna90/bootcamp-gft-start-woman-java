import dadosclientes.Cliente;
import funcionalidadesbanco.Menu;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Cliente> c = new ArrayList<>(); //Armazena as contas dos clientes
        Menu menu = new Menu(); //Permite acessar as funcoes do programa

        //Mensagem de boas vindas
        String linha = "---------------------------------------------------------------------------";
        System.out.println(linha+"\nBEM VINDO(A) AO BANCO DIGITAL ONE!\n");

        //Iniciando cadastro
        c.add(menu.iniciarCadastro(c, menu, linha));
        System.out.println("\n"+c.get(0).getTipoConta()+" aberta com sucesso!");

        //Armazena o retorno
        Cliente cliente = null;

        //Entrando na conta cadastrada
        if (c.get(0).getTipoConta().equals("Conta Corrente")) {
            cliente = menu.entrarContaCorrente(c.get(0), linha, menu, c, 1);
        } else {
            cliente = menu.entrarContaPoupanca(c.get(0), linha, menu, c, 2);
        }

        while (true) { //Segue entrando em diferentes contas enquanto verdadeiro
            if (cliente != null) {
                if (cliente.getTipoConta().equals("Conta Corrente")) {
                    cliente = menu.entrarContaCorrente(cliente, linha, menu, c, 1);
                } else {
                    cliente = menu.entrarContaPoupanca(cliente, linha, menu, c, 2);
                }
            } else {
                break;
            }
        }
    }
}

