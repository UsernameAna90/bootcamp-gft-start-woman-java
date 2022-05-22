package funcionalidadesbanco;

import dadosclientes.Cliente;
import dadosclientes.Endereco;

import java.text.DecimalFormat;

public class ContaCorrente extends Conta{

    //Construtor
    public ContaCorrente(int idConta, String tipoConta) {
        super(idConta, tipoConta);
    }

    //Metodos
    public double solicitarEmprestimo(Cliente cliente, double emprestimo) {
        /* Processa a possibilidade de realizar um emprestimo baseado no salario do individuo
         * 10% do salario deve ser pago ao banco por no maximo 6 anos (72 meses) para quitar a divida
         * A taxa de juros ao mes varia de acordo com o valor da parcela (0,01% do valor da parcela)
         */

        //Calcula o valor da parcela a ser paga ao banco mensalmente (10% do salario)
        double parcela = cliente.getSalario() * 0.1;
        //Calcula o valor maximo que o banco pode oferecer para emprestimo (10% do salario por 6 anos)
        double valorMaximo = parcela * 72;

        if (emprestimo <= valorMaximo) {
            //Calcula a taxa de juros a ser aplicada mensalmente (0,01% do valor da parcela)
            double taxaJuros = parcela * 0.01;
            //Calcula o valor final da parcela com juros
            double parcelaMaisJuros = parcela + taxaJuros;
            //Calcula a quantidade de parcelas mensais a serem pagas
            int meses =  (int) emprestimo / (int)parcela;

            System.out.println("Solicitacao de emprestimo no valor de "+String.format("%.2f", emprestimo)+" processada com sucesso!");

            if (emprestimo % parcela != 0) {
                //Calcula o valor restante para quitar a divida, incluindo juros mensal
                double ultimaParcela = (emprestimo - (parcela * meses)) + taxaJuros;

                System.out.print("Oferta disponivel: "+meses+" vezes de R$"+ String.format("%.2f", parcelaMaisJuros)+", ");
                System.out.print("e mais uma vez de RS"+String.format("%.2f", ultimaParcela)+".");
                return emprestimo;
            } else {
                System.out.println("Oferta disponivel: "+meses+" vezes de R$"+ String.format("%.2f",parcelaMaisJuros)+".");
                return emprestimo;
            }

        } else {
            System.out.println("Impossivel conceder emprestimo. Valor solicitado excedido!");
            return 0;
        }
    }

    private void efetuarEmprestimo(double parcela) {
        //Deposita o valor do emprestimo solicitado na conta do individuo
        double emprestimo = Math.round(parcela * 72);
        this.setSaldoDisponivel(this.getSaldoDisponivel() + emprestimo);

        System.out.println("Emprestimo de "+String.format("%.2f",emprestimo)+" realizado com sucesso!");
        this.verSaldo();
    }

    public void solicitarCartao(Endereco endereco) {
        System.out.println("Solicitacao de cartao processada com sucesso!");
        System.out.println("Seu cartao esta a caminho! Sera entregue no endereco: ");
        System.out.println("\" "+endereco.toString()+" \"");
    }

    public void cobrarManutencaoConta() {
        double manutencao = 20.55;
        this.setSaldoDisponivel(getSaldoDisponivel() - manutencao);

        System.out.println("Taxa de manutencao da conta no valor de "+String.format("%.2f",manutencao)+" debitada com sucesso!");
        this.verSaldo();
    }
}
