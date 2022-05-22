package funcionalidadesbanco;

import java.util.Random;

public abstract class Conta {

    //Atrbutos
    private int idConta;
    private int numeroConta;
    private int numeroAgencia;
    private double saldoDisponivel = 0; //A conta é aberta sem saldo
    private String tipoConta;

    //Construtor
    public Conta(int idConta, String tipoConta) {
        this.idConta = idConta;
        this.gerarNumeroConta();
        this.gerarNumeroAgencia();
        this.setTipoConta(tipoConta);
    }

    //Auxiliares
    public int getId() {
        return idConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public long getNumeroAgencia() {
        return numeroAgencia;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    protected void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    //Metodos

    //Gera um numero aleatorio
    Random gerador = new Random();

    private void gerarNumeroConta() {
        //Atribui um numero aleatorio para a conta
        this.numeroConta = gerador.nextInt(9999);
    }

    private void gerarNumeroAgencia() {
        //Atribui um numero aleatorio para a agencia
        this.numeroAgencia = gerador.nextInt(99999999);
    }

    public void depositar(double deposito) {
        //Realiza o deposito de um valor na conta, que vai para o saldo disponivel
        this.setSaldoDisponivel(getSaldoDisponivel() + deposito);

        System.out.println("Deposito de R$"+String.format("%.2f", deposito)+" realizado com sucesso!");
        this.verSaldo();
    }

    public void sacar(double saque) {
        //Se houver saldo disponivel suficiente na conta, realiza o saque slicitado.
        int valorSaqueMaximo = 1000;

        if (saque > this.getSaldoDisponivel()) {
            System.out.println("Impossível realizar saque. Saldo indisponível!");
        } else if(saque > valorSaqueMaximo) {
            System.out.println("Impossível realizar saque. Valor excede o permitido!");
        } else {
            this.setSaldoDisponivel(this.getSaldoDisponivel() - saque);
            System.out.println("Saque de R$"+String.format("%.2f", saque)+" realizado com sucesso!");
            this.verSaldo();
        }
    }

    public void transferir(double valor, Conta conta) {
        //Se a conta informada existir, e se o saldo na conta solicitante nao for invalido
        //realiza a tranferencia sacando da conta do solicitante e depositando na conta solicitada
        int valorTransferenciaMaxima = 1000;

        if (this.getSaldoDisponivel() < valor) {
            System.out.println("Impossível realizar saque. Saldo indisponível!");
        } else if(valor > valorTransferenciaMaxima) {
            System.out.println("Impossível realizar saque. Valor excede o permitido!");
        } else {
            this.setSaldoDisponivel(this.getSaldoDisponivel() - valor);
            conta.setSaldoDisponivel(conta.getSaldoDisponivel() + valor);
            System.out.println("Transferencia de R$"+String.format("%.2f", valor)+" realizada com sucesso!");
            this.verSaldo();
        }
    }

    //Imprime o valor de saldo disponivel na conta
    public void verSaldo() { System.out.println("Saldo atual: R$"+String.format("%.2f", this.getSaldoDisponivel())); }

    @Override
    public String toString() {
        return "Tipo de Conta: " + tipoConta +
                "\nNumero da Conta: " + numeroConta +
                "\nNumero da Agencia: " + numeroAgencia +
                "\nSaldo Disponivel: R$" + String.format("%.2f", saldoDisponivel);
    }
}