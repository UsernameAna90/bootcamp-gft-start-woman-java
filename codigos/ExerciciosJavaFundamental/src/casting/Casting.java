package casting;

public class Casting {
    public static void main(String[] args) {
        //Declarando variáveis
        int int1 = 10;
        int int2 = 20;
        long lon1 = 10000000000l;
        long lon2 = 20000000000l;
        float dec1 = 10.50f;
        double declon1 = 1000.5090d;
        float dec2 = 10.50f;
        double declon2 = 1000.5090d;

        //Realizando o casting
        lon1 = int1; //Casting implícito
        int2 = (int) lon2; //Casting explícito
        dec1 = (float) declon1; //Casting explícito
        declon2 = dec2; //Casting implícito

        System.out.println("Programa concluído com sucesso!");
    }
}
