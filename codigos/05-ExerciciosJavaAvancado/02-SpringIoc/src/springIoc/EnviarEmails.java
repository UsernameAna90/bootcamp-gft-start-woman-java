package springIoc;

public class EnviarEmails {

    public EnviarEmails(String tipo, String endereco, String senha) {

    }

    public static EnviarEmails obterDadosEmail() {
        return new EnviarEmails("simples", "contato@gmail.com", "senha123");
    }

    public void retornar(String mensagem) {
        System.out.println("Email enviado com sucesso!");
    }
}
