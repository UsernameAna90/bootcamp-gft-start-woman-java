package dadosclientes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Auxiliares
@Getter
@Setter

//Construtor
//@AllArgsConstructor

public class Endereco {

    //Atributos
    private int idEndereco;
    private int numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    //Construtor
    public Endereco(int idEndereco, int numero, String rua, String bairro, String cidade, String estado) {
        this.idEndereco = idEndereco;
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    //Metodos
    public void atualizarEndereco(int opcao, String novoValor) {
        switch (opcao) {
            case 1:
                this.setNumero(Integer.parseInt(novoValor));
                System.out.println("\nNumero atualizado com sucesso!");
                break;
            case 2:
                this.setRua(novoValor);
                System.out.println("\nRua atualizada com sucesso!");
                break;
            case 3:
                this.setBairro(novoValor);
                System.out.println("\nBairro atualizado com sucesso!");
                break;
            case 4:
                this.setCidade(novoValor);
                System.out.println("\nCidade atualizada com sucesso!");
                break;
            case 5:
                this.setEstado(novoValor);
                System.out.println("\nEstado atualizado com sucesso!");
                break;
            default:
                System.out.println("\nImpossivel atualizar. Valor invalido!");

        }
    }

    @Override
    public String toString() {
        return "Rua: " + rua + ", " + numero +
                "\nBairro: " + bairro +
                "\nCidade: " + cidade +
                "\nEstado: " + estado;
    }
}
