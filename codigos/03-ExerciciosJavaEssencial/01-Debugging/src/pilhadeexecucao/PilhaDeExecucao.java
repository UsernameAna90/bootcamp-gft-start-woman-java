package pilhadeexecucao;

public class PilhaDeExecucao {
    public static void main(String[] args) {
        System.out.println("Iniciado o programa no metodo main!");
        String t = "- ";
        String r = a(t);
        System.out.println(t + r);
        System.out.println("Finalizando o programa no metodo main!");
    }

    static String a(String t) {
        System.out.println(t + "Método A!");
        String r = b(t += "- ");
        System.out.println(t + r);
        return "Saindo de A!";
    }

    static String b(String t) {
        System.out.println(t + "Método B!");
        String r = c(t += "- ");
        System.out.println(t + r);
        return "Saindo de B!";
    }

    static String c(String t) {
        System.out.println(t + "Método C!");
        String r = d(t += "- ");
        System.out.println(t + r);
        return "Saindo de C!";
    }

    static String d(String t) {
        System.out.println(t + "Método D!");
        return "Saindo de D!";
    }
}
