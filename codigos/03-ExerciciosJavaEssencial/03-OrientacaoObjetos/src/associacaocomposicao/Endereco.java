package associacaocomposicao;

public class Endereco {
    //Endereco depende de pessoa,
    //pois sem uma pessoa rnvolvida não ha porque armazenar um endereco

    //Atributos
    int numero;
    String rua;
    String bairro;
    String cidade;

    //Contrutor
    public Endereco(int numero, String rua, String bairro, String cidade) {
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    //Metodo
    @Override
    public String toString() {
        return "numero: " + numero +
                "\nrua: " + rua +
                "\nbairro: " + bairro +
                "\ncidade: " + cidade;
    }
}
