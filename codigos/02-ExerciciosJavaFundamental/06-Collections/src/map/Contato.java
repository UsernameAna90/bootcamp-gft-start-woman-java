package map;

import java.util.Objects;

public class Contato {
    //Atributos
    private String nome;
    private long numero;

    //Construtor
    public Contato(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Auxiliares
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }

    //Sobrepostos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return getNumero() == contato.getNumero() &&
                Objects.equals(getNome(), contato.getNome());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumero());
    }
    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
