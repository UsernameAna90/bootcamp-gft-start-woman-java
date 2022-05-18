# Debugging

Erros no código são também chamados de "bugs". E o ato de identificar e corrigir esses bugs é chamado de debugging ou depuração. Linguagens de alto nível possuem poderosas ferramentas de depuração de código, mas para entender seu funcionamento, é necessário compreender os conceitos de pilha de execuçao e stack trace:

* Pilha de execução: Empilha os métodos em uma estrutura de pilha na ordem em que vão sendo chamados;

* Stack trace: Registra os quadros de pilhas ativas permitindo visualizar uma lista das chamadas de métodos;

Dois tipos de erros podem ser encontrados: erros de sintaxe e erros de semântica. Erros de sintaxe são denunciados pela própria IDE. No entanto, erros de semântica são erros de lógica, e normalmente são por eles que se procura em uma depuração. Durante o debugging utiliza-se a pilha de execução para navegar em qualquer direção na execução do código, analisando seu comportamento a fim de descobrir possiveis causas do erro. 

### Realizando o debugging

* Pode-se inserir um breakpoint na linha na qual se acredita estar o erro;

* Deve-se executar o código no modo "Debug";

* Pode-se executar linha por linha, ou resumir a execução até o linha onde se acredita estar o erro;

* Pode-se fazer uso de diversos recursos para analisar o código:<br/>
° Step Over: Executa próxima operação sem entrar no método;<br/>
° Step Into: Executa próxima operação entrandor no método;<br/>
° Step Out: Sai do método sem terminar sua execução;<br/>
° Evaluate: Simula a execução de um método;<br/>
° Variables: Inpeciona uma variável;<br/>
° Re-run: Executa novamente o código;<br/>
° Stop: Para a execução do debug;
