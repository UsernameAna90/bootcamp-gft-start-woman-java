# Sobrecarga

A sobrecarga ocorre quando um método é utilizado para executar diferentes funções. 
Consiste na criação de mais de uma versão de um método com o mesmo nome, porém, recebendo uma lista de parâmetros diferente. 
Assim, quando o método é chamado, o Java busca pela versão do método que corresponde aos parâmetros passados e executa seu respectivo bloco de comandos.

### Exemplo

<pre>
public class CalculoEquilatero {
    public static void area(float lado) {
        //Calcula a área de um quadrado
        System.out.println("Área do quadrado: " + (lado * lado));
    }

    public static void area(float base, float altura) {
        //Calcula a área de um retângulo
        System.out.println("Área do quadrado: " + (base * altura));
    }
</pre>

O mesmo método realiza cálculos distintos.
