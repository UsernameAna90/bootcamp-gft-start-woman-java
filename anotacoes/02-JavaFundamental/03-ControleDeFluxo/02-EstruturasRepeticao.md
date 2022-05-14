# Estruturas de repetição

As estruturas de repetição permitem que uma sequência de comando seja executada repetidamente enquanto uma determinada condição for verdadeira.

* While: Testa uma condição, e caso seja verdadeira, executa um bloco de comandos. Normalmente utilizado quando não se tem uma quantidade pré-definida de repetições.
<pre>
  while (condição) {
     < bloco de comandos >;
     variável de controle de repetição;
  }
</pre>

* Do While: Executa um bloco de comandos, e depois testa uma condição. Caso ela seja verdadeira, retorna ao início do loop.
<pre>
  do {
    < bloco de comandos >;
    variável de controle de repetição;
  } while (condição);
</pre>

* For: Opera de forma semelhante ao while. Normalmente utilizado quando se tem uma quantidade pré-definida de repetições.
<pre>
  for (< variavel >; < condição >; < incremento >) {
    < bloco de comandos >;
  } 
</pre>

* Enhanced For ou For Each: Possui as mesmas funções do for, porém, sua principal característica é a simplificação do loop. Normalmente utilizado para percorrer listas e collections.
<pre>
  for (tipo variavel : lista) {
    < bloco de comandos >;
  } 
</pre>

