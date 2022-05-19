package interfaceclasses;

public class OperacoesBasicas implements Calculadora{
    @Override
    public double soma(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double subt(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double divi(double n1, double n2) {
        return n1 / n2;
    }

    @Override
    public double mult(double n1, double n2) {
        return n1 * n2;
    }
}
