package associacaoagregacao;

public class Curso {
    //Atributos
    int id;
    String nome;

    //Construtor
    public Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //Metodos
    @Override
    public String toString() {
        return "id curso: " + id +
                "\nnome curso: " + nome ;
    }
}
