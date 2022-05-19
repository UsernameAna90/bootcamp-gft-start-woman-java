package interfaceclasses;

public class Main {
    public static void main(String[] args) {
        OperacoesBasicas calculadora = new OperacoesBasicas();

        System.out.println("Soma: "+calculadora.soma(25.50, 85.75));
        System.out.println("Subtracao: "+calculadora.subt(25.50, 85.75));
        System.out.println("Divisao: "+calculadora.divi(25.50, 85.75));
        System.out.println("Multiplicacao: "+calculadora.mult(25.50, 85.75));
    }
}
