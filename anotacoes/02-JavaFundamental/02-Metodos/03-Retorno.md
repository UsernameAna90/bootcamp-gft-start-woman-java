# Retorno

O retorno é uma instrução de iterrupção atrelada ao método. Ele é executado por meio do comando "return" quando é encontrado no método, seja no corpo de execução ou no final do mesmo.

* O tipo do retorno é definido no momento da criação do método;

* O tipo de dado retornado deve ser compatível com o tipo definido;

* Se o tipo de retorno for "void", o método pode conter ou não o comando retorno mas não pode retornar nenhum tipo de dado;

### Exemplo
<pre>
public static float area(float base1, float base2,float altura) {
    //Calcula a área de um trapézio
    return ((base1 + base2) * altura) / 2;
}
</pre>
