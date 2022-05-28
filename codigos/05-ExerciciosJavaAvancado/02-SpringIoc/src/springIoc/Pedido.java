package springIoc;

public class Pedido {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.gravar();
    }

    //Inversão de controle
    private EnviarEmails enviar = EnviarEmails.obterDadosEmail();

    public void gravar() {
        this.enviar.retornar("Pedido Criado!");
    }
}
