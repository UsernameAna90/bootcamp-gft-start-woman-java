# Estruturas condicionais

Estruturas de controle de fluxo condicionais tem a capacidade de controlar o fluxo de execução do código de acordo com uma condição.

* If - Else: Avalia um condição, e se ela for verdadeira executado um bloco de comandos. Se não, executa outro bloco de comandos.
<br/>° Padrão de definição:
<pre>
      if (condição) {
         < bloco de comandos 1 >;
      } else {
         < bloco de comandos 2 >;
      }
</pre>

* Switch - Case: Avalia um condição, e se ela corresponder a uma das opções em sua lista de opções, executa seu respectivo bloco de comandos.
<br/>° Padrão de definição:
<pre>
      switch (variavel) {
         case opção1:
           < bloco de comandos 1 >;
           break;
         case opção2:
           < bloco de comandos 2 >;
           break;
         case opçãoN:
           < bloco de comandos N >;
           break;
         default:
           < bloco de comandos default >;
           break;
      }
</pre>
