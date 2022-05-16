package map;

import java.util.Objects;

public class Livro {
    //Atributos
    private String nome;
    private String autor;
    private int paginas;

    //Construtor
    public Livro(String nome, String autor, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
    }

    //Auxiliares
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //Sobrepostos
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return getPaginas() == livro.getPaginas() &&
                Objects.equals(getNome(), livro.getNome()) &&
                Objects.equals(getAutor(), livro.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getAutor(), getPaginas());
    }
}
