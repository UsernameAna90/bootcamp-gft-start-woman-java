package funcionalidadesbanco;

public class ContaPoupanca extends Conta {

    //Construtor
    public ContaPoupanca(int idConta, String tipoConta) {
        super(idConta, tipoConta);
    }

    //Metodos
    public void renderAoMes() {
        //Rende 0,05 ao mes
        double rendimento = Math.round(this.getSaldoDisponivel() * 0.05);
        this.setSaldoDisponivel(this.getSaldoDisponivel() + rendimento);

        System.out.println("Rendimento do seu saldo nesse mes: R$"+ String.format("%.2f", rendimento));
        this.verSaldo();
    }
}
