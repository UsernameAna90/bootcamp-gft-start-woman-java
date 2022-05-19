package associacaoagregacao;

public class AssociacaoAgregacao {
    public static void main(String[] args) {
        //Instanciando obejetos independentes
        Curso c1 = new Curso(23, "Programacao");
        Aluno a1 = new Aluno(15, "Artemis", 26, c1);

        System.out.println(a1.toString());
    }
}
