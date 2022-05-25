package funcionalidadesbanco;

public class ContaPoupanca extends Conta {

    //Construtor
    public ContaPoupanca(int idConta) {
        super(idConta);
    }

    //Metodos
    public double renderAoMes() {
        //Rende 0,05 ao mes
        double rendimento = this.getSaldoDisponivel() * 0.05;

        return rendimento;
    }
}
