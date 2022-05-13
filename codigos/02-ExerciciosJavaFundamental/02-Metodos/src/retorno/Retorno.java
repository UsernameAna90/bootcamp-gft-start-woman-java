package retorno;

public class Retorno {
    public static void main(String[] args) {
        /*
         * Chamando o mesmo método para efetuar funções diferentes
         * E armazenando seu retorno em variáveis
         */
        float quadrado = EquilateroRetorno.area(6.5f);
        float retangulo = EquilateroRetorno.area(7, 9);
        float trapezio = EquilateroRetorno.area(4, 3, 7);

        //Imprimindo resultados
        System.out.println("Área do quadrado: " + quadrado);
        System.out.println("Área do retangulo: " + retangulo);
        System.out.println("Área do trapezio: " + trapezio);
    }
}
