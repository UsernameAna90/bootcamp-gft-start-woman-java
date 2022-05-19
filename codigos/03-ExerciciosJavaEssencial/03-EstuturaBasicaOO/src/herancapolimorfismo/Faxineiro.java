package herancapolimorfismo;

public class Faxineiro extends Funcionario {
    //Atributos
    boolean limpando = false;

    //Auxiliar
    public boolean isLimpando() {
        return this.limpando;
    }

    //Construtor
    public Faxineiro(String nome, int idade, long cpf, double salario) {
        super(nome, idade, cpf, salario);
    }

    //Metodos
    public void comecarLimpeza() {
        if (!this.isLimpando()) {
            this.limpando = true;
            System.out.println("Iniciando limpeza!");
        } else {
            System.out.println("Limpeza já está realizada!");
        }
    }

    public void terminarLimpeza() {
        if (this.isLimpando()) {
            this.limpando = false;
            System.out.println("Terminando limpeza!");
        } else {
            System.out.println("Limpeza já pronta!");
        }
    }

    //Sobrescicao
    @Override
    public void status() {
        System.out.println("Nome: "+this.getNome()+
                "\nIdade: "+this.getIdade()+
                "\nCPF: "+this.getCpf()+
                "\nSalario: "+this.getSalario()+
                "\nLimpando: "+this.isLimpando()+"\n");
    }
}
