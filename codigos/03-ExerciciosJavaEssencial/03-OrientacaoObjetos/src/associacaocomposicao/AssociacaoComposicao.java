package associacaocomposicao;

public class AssociacaoComposicao {
    public static void main(String[] args) {
        //Instanciando objeto
        Pessoa p1 = new Pessoa("Sebastian", 22, 12345678910L,
                new Endereco(100, "Angel's Cross", "Sky", "Heaven"));

        System.out.println(p1.toString());
    }
}
