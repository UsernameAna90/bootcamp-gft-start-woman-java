package estruturabasica;

public class EstruturaBasica {
    public static void main(String[] args) { //classe principal
        //Instanciando objetos
        Carro c1 = new Carro("Preto", "Fiesta", "Sedan", 54);
        Carro c2 = new Carro("Branco", "Toyota", "Corolla", 60 );

        //Mensagem
        System.out.println(c1.toString());
        c1.encherTanque(12);
        System.out.println(c1.toString());
        c1.encherTanque("Vazio");
    }
}
