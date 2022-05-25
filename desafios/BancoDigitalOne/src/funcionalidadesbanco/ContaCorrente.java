package funcionalidadesbanco;

import dadosclientes.Cliente;
import dadosclientes.Endereco;

import java.text.DecimalFormat;

public class ContaCorrente extends Conta{

    //Construtor
    public ContaCorrente(int idConta) {
        super(idConta);
    }

    //Metodos
    public void solicitarEmprestimo(double emprestimo, double parcela) {
        //Calcula a taxa de juros a ser aplicada mensalmente (0,01% do valor da parcela)
        double taxaJuros = parcela * 0.01;
        //Calcula o valor final da parcela com juros
        double parcelaMaisJuros = parcela + taxaJuros;
        //Calcula a quantidade de parcelas mensais a serem pagas
        int meses =  (int) emprestimo / (int)parcela;

        System.out.println("\nSolicitacao de emprestimo no valor de "+String.format("%.2f", emprestimo)+" processada com sucesso!");

        if (emprestimo % parcela != 0) {
            //Calcula o valor restante para quitar a divida, incluindo juros mensal
            double ultimaParcela = (emprestimo - (parcela * meses)) + taxaJuros;

            System.out.print("Oferta disponivel: "+meses+" vezes de R$"+ String.format("%.2f", parcelaMaisJuros)+", ");
            System.out.print("e mais uma vez de RS"+String.format("%.2f", ultimaParcela)+".");
        } else {
            System.out.println("Oferta disponivel: "+meses+" vezes de R$"+ String.format("%.2f",parcelaMaisJuros)+".");
        }
    }

    protected void efetuarEmprestimo(double emprestimo) {
        //Deposita o valor do emprestimo solicitado na conta do individuo
        this.depositar(emprestimo);
    }

    public void solicitarCartao(Endereco endereco) {
        System.out.println("Solicitacao de cartao processada com sucesso!");
        System.out.println("Seu cartao esta a caminho! Sera entregue no endereco: \n");
        System.out.println(endereco.toString());
    }
}
