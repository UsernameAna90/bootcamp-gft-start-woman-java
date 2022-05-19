package herancapolimorfismo;

public class Gerente extends Funcionario{
    //Atributos
    private boolean projetoAtivo = false;

    //Construtor
    public Gerente(String nome, int idade, long cpf, double salario) {
        super(nome, idade, cpf, salario);
    }

    //Auxiliares
    public boolean isProjetoAtivo() {
        return projetoAtivo;
    }

    //Metodos
    public void iniciarProjeto() {
        if (!this.isProjetoAtivo()) {
            this.projetoAtivo = true;
            System.out.println("Projeto iniciado!");
        } else {
            System.out.println("Projeto já está ativo!");
        }
    }

    public void finalizarProjeto() {
        if (this.isProjetoAtivo()) {
            this.projetoAtivo = false;
            System.out.println("Projeto finalizado!");
        } else {
            System.out.println("Projeto já está inativo!");
        }
    }

    //Sobrescicao
    @Override
    public void status() {
        System.out.println("Nome: "+this.getNome()+
                "\nIdade: "+this.getIdade()+
                "\nCPF: "+this.getCpf()+
                "\nSalario: "+this.getSalario()+
                "\nProjeto ativo: "+this.isProjetoAtivo()+"\n");
    }

}
