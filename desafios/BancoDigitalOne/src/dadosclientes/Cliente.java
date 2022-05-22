package dadosclientes;

import funcionalidadesbanco.Conta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Auxiliares
@Getter
@Setter

//Construtor
@AllArgsConstructor

public class Cliente {

    //Atributos
    private int idCliente;
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private double salario;
    private Endereco endereco;
    private Conta conta;

    //Metodos
    public void atualizarDados(int opcao, String novoValor) {
        //Atualiza determinado atributo de acordo com a opcao escolhida
        switch (opcao) {
            case 1:
                this.setNome(novoValor);
                System.out.println("Nome atualizado com sucesso!");
                break;
            case 2:
                this.setIdade(Integer.parseInt(novoValor));
                System.out.println("Idade atualizada com sucesso!");
                break;
            case 3:
                this.setCpf(novoValor);
                System.out.println("CPF atualizado com sucesso!");
                break;
            case 4:
                this.setEmail(novoValor);
                System.out.println("Email atualizado com sucesso!");
                break;
            case 5:
                this.setSalario(Double.parseDouble(novoValor));
                System.out.println("Salario atualizado com sucesso!");
                break;
            default:
                System.out.println("Impossivel atualizar. Valor invalido!");

        }
    }

    public String visualizarDados() {
        return "ID: " + idCliente +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nCPF: " + cpf +
                "\nEmail: " + email +
                "\nSalario: " + String.format("%.2f", salario) +
                "\n" + endereco +
                "\n" + conta;
    }
}
