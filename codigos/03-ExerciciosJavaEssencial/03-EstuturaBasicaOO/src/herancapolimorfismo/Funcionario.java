package herancapolimorfismo;

public class Funcionario {
    //Atributos
    private String nome;
    private int idade;
    private long cpf;
    private double salario;

    //Construtor
    public Funcionario(String nome, int idade, long cpf, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }

    //Auxiliares
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(long salario) {
        this.salario = salario;
    }

    //Metodos
    public void fazerAniversario() {
        this.setIdade(getIdade() + 1);
        System.out.println("Parabens pelo seu aniversario, "+this.getNome()+"!\n");
    }

    public void status() {
        System.out.println("Nome: "+this.getNome()+
                "\nIdade: "+this.getIdade()+
                "\nCPF: "+this.getCpf()+
                "\nSalario: "+this.getSalario()+"\n");
    }
}
