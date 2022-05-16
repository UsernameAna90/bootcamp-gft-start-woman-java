package set;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
    //Atributos
    private String nome;
    private String genero;
    private double duracao;

    //Auxiliares
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    //Contrutor
    public Serie(String nome, String genero, double duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    //Sobrescritos
    @Override
    public String toString() {
        return "Serie{" +
                "nome=" + nome +
                ", genero=" + genero +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return getNome() == serie.getNome() &&
                getGenero() == serie.getGenero() &&
                Double.compare(serie.getDuracao(), getDuracao()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getDuracao());
    }

    @Override
    public int compareTo(Serie serie) {
        int tempo = Double.compare(this.getDuracao(), serie.getDuracao());
        if (tempo != 0) return tempo;

        //Caso os tempos sejam iguais, os nomes serao usados para desempate
        int nome = this.getNome().compareTo(serie.getNome());
        return nome;
    }
}




