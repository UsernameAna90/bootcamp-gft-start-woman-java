package funcionalidadesbanco;

import java.util.Random;

public abstract class Conta {

    //Atrbutos
    private int idConta;
    private int numeroConta;
    private int numeroAgencia;
    private double saldoDisponivel = 0; //A conta é aberta sem saldo

    //Construtor
    public Conta(int idConta) {
        this.idConta = idConta;
        this.gerarNumeroConta();
        this.gerarNumeroAgencia();
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
        this.setSaldoDisponivel(this.getSaldoDisponivel() + deposito);
    }

    public void sacar(double saque) {
        //Realiza o saque solicitado.
        this.setSaldoDisponivel(this.getSaldoDisponivel() - saque);
    }

    public void transferir(double valor, Conta conta) {
        //Realiza a transferencia sacando da conta do solicitante e depositando na conta solicitada
        this.sacar(valor);
        conta.depositar(valor);
    }

    //Imprime o valor de saldo disponivel na conta
    public void verSaldo() { System.out.println("Saldo atual: R$"+String.format("%.2f", this.getSaldoDisponivel())); }

    @Override
    public String toString() {
        return "Numero da Conta: " + numeroConta +
                "\nNumero da Agencia: " + numeroAgencia +
                "\nSaldo Disponivel: R$" + String.format("%.2f", saldoDisponivel);
    }
}