package associacaocomposicao;

public class Pessoa {
    //Atributos
    String nome;
    int idade;
    long cpf;
    Endereco endereco;

    //Construtor
    public Pessoa(String nome, int idade, long cpf, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    //Metodos
    @Override
    public String toString() {
        return "nome: " + nome +
                "\nidade: " + idade +
                "\ncpf: " + cpf +
                "\n" + endereco;
    }
}
