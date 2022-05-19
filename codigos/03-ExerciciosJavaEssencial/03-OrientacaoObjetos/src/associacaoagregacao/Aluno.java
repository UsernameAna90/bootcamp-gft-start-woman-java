package associacaoagregacao;

public class Aluno {
    //Atributos
    int id;
    String nome;
    int idade;
    Curso curso;

    //Construtor
    public Aluno(int id, String nome, int idade, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    //Metodos
    @Override
    public String toString() {
        return "id aluno: " + id +
                "\nnome aluno: " + nome +
                "\nidade: " + idade +
                "\n" + curso;
    }
}
