package primeiroprojeto;

import java.util.Objects;

public class Gato {
    //ATRIBUTOS
    private String nome;
    private String cor;
    private int idade;

    //METODO CONSTRUTOR
    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    //METODOS AUXILIARES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //METODOS
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return idade == gato.idade &&
                Objects.equals(nome, gato.nome) &&
                Objects.equals(cor, gato.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }
}
