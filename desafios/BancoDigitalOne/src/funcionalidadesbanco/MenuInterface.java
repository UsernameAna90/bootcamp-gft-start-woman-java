package funcionalidadesbanco;

import dadosclientes.Cliente;
import java.util.List;

public interface MenuInterface {

    //Funcionalidade do menu da aplicacao
    public Cliente iniciarCadastro(List<Cliente> c, Menu menu, String linha);
    public Cliente abrirConta(int opcao, int id);
    public Cliente entrarContaCorrente(Cliente c, String linha, Menu menu, List<Cliente> ls, int tipoConta);
    public Cliente entrarContaPoupanca(Cliente c, String linha, Menu menu, List<Cliente> ls, int tipoConta);
    public void realizarDeposito(Cliente c, int tipoConta);
    public void realizarSaque(Cliente c, int tipoConta);
    public void realizarTransferencia(Cliente c, List<Cliente> lc, int tipoConta);
    public void solicitarEmprestimo(Cliente c, String linha);
    public void solicitarCartao(Cliente c, String linha);
    public void verMeusDados(Cliente c, String linha, int tipoConta);
    public Cliente verMinhasContas(List<Cliente> ls, Menu menu, String linha);
    public List<Cliente> abirNovaConta(List<Cliente> c, Menu menu, String linha);
    public void verRendimentoMental(Cliente c);
    public int encerrarPrograma(String linha);
}
