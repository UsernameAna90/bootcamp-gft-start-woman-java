package funcionalidadesAuxiliares;

import dadosclientes.Cliente;
import dadosclientes.Endereco;
import java.util.Map;

public class Instanciacao {

    public Endereco instanciarEndereco(Map<String, String> dados, int id) {
        Endereco e = new Endereco(id,
                Integer.parseInt(dados.get("Numero")),
                dados.get("Rua"),
                dados.get("Bairro"),
                dados.get("Cidade"),
                dados.get("Estado")
        );

        return e;
    }

    public Cliente instanciarCliente(Map<String, String> dados, int id, int opcao, Endereco e) {
        Cliente c = new Cliente(id,
                dados.get("Nome"),
                Integer.parseInt(dados.get("Idade")),
                dados.get("CPF"),
                dados.get("Email"),
                Double.parseDouble(dados.get("Salario")),
                e
        );

        return c;
    }
}
