package dadosclientes;


import funcionalidadesbanco.ContaCorrente;
import funcionalidadesbanco.ContaPoupanca;
import lombok.Getter;
import lombok.Setter;

//Auxiliares
@Getter
@Setter

public class Cliente {

    //Atributos
    private int idCliente;
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private double salario;
    private Endereco endereco;
    private String tipoConta;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    //Construtor
    public Cliente(int idCliente, String nome, int idade, String cpf, String email, double salario, Endereco endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }

    //Metodos
    public void atualizarDados(int opcao, String novoValor) {
        //Atualiza determinado atributo de acordo com a opcao escolhida
        switch (opcao) {
            case 1:
                this.setNome(novoValor);
                System.out.println("\nNome atualizado com sucesso!");
                break;
            case 2:
                this.setIdade(Integer.parseInt(novoValor));
                System.out.println("\nIdade atualizada com sucesso!");
                break;
            case 3:
                this.setEmail(novoValor);
                System.out.println("\nEmail atualizado com sucesso!");
                break;
            case 4:
                this.setSalario(Double.parseDouble(novoValor));
                System.out.println("\nSalario atualizado com sucesso!");
                break;
            default:
                System.out.println("\nImpossivel atualizar. Valor invalido!");

        }
    }

    public String visualizarDadosContaCorrente() {
        return "ID: " + idCliente +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nCPF: " + cpf +
                "\nEmail: " + email +
                "\nSalario: " + String.format("%.2f", salario) +
                "\n" + endereco +
                "\nTipo de Conta: " + tipoConta +
                "\n" + contaCorrente;
    }

    public String visualizarDadosContaPoupanca() {
        return "ID: " + idCliente +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nCPF: " + cpf +
                "\nEmail: " + email +
                "\nSalario: " + String.format("%.2f", salario) +
                "\n" + endereco +
                "\nTipo de Conta: " + tipoConta +
                "\n" + contaPoupanca;
    }
}
