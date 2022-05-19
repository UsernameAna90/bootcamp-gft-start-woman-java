package estruturabasica;
/*
 * Criar uma classe carro
 * Criar atributos
 * Criar metodos: contrutor, destrutor, auxiliares e de sobrecarga
 */

public class Carro { //Classe
    //Atributos
    String cor;
    String marca;
    String modelo;
    double capacidadeTanque;

    //Contrutor
    public Carro(String cor, String marca, String modelo, double capacidadeTanque) {
        this.setCor(cor);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCapacidadeTanque(capacidadeTanque);
    }

    //Destrutor
    @Override
    protected void finalize() {
        try {
            super.finalize();
        } catch (Throwable throwable) {
            System.out.println(throwable);
        }
        System.out.println("Finalizado!");
    }

    //Auxiliares
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return this.cor;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public double getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    //Sobrecarga
    public void encherTanque(double qtdGasolinaAtual) {
        double qtdGasolinaFaltante = this.getCapacidadeTanque() - qtdGasolinaAtual;
        System.out.println("Faltam "+qtdGasolinaFaltante +" litros de gasolina para encher o tanque!\n");
    }

    public void encherTanque(String tanqueVazio) {
        if (tanqueVazio.toLowerCase().equals("vazio")) {
            System.out.println("Faltam "+this.getCapacidadeTanque()+" litros de gasolina para encher o tanque!\n");
        } else {
            System.out.println("Quantidade invalida!\n");
        }
    }

    //Estado
    @Override
    public String toString() {
        return "Cor= " + cor +
                "\nMarca= " + marca +
                "\nModelo= " + modelo +
                "\nCapacidadeTanque= " + capacidadeTanque + "\n";
    }
}
