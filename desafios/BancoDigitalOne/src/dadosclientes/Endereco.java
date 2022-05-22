package dadosclientes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Auxiliares
@Getter
@Setter

//Construtor
@AllArgsConstructor

public class Endereco {

    //Atributos
    private int idEndereco;
    private int numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    //Metodos
    public void atualizarEndereco(int opcao, String novoValor) {
        switch (opcao) {
            case 1:
                this.setNumero(Integer.parseInt(novoValor));
                System.out.println("Numero atualizado com sucesso!");
                break;
            case 2:
                this.setRua(novoValor);
                System.out.println("Rua atualizada com sucesso!");
                break;
            case 3:
                this.setBairro(novoValor);
                System.out.println("Bairro atualizado com sucesso!");
                break;
            case 4:
                this.setCidade(novoValor);
                System.out.println("Cidade atualizada com sucesso!");
                break;
            case 5:
                this.setEstado(novoValor);
                System.out.println("Estado atualizado com sucesso!");
                break;
            default:
                System.out.println("Impossivel atualizar. Valor invalido!");

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
