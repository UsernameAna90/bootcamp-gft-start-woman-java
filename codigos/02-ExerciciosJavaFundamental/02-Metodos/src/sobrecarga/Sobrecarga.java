package sobrecarga;

public class Sobrecarga {
    public static void main(String[] args) {
        //Chamando o mesmo método para efetuar funções diferentes
        CalculoEquilatero.area(7.5f);
        CalculoEquilatero.area(10, 12.5f);
        CalculoEquilatero.area(10, 8, 15);
    }
}
