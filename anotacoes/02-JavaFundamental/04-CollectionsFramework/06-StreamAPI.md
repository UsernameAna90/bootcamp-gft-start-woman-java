# Stream API

A Stream API é um recurso que permite trabalhar com Collections de forma mais eficiente, envolvendo quantidade menor de código. <br/>
Para compreender o funcionamento desse recurso é necessário compreender os conceitos classe anônima, functional interface, função lambda e reference method.
  
* Classe anônima: Uma classe que não recebe nome. É tanto declarada quanto instanciada em uma única instrução. Seu objetivo é substituir a criação de classes simples, agilizando o processo de utilização das mesmas. Normalmente é usado no lugar de uma classe que só será utilizada uma vez;
  
* Functional interface: Uma interface funcional é aquela que possui apenas um método abstrato. Sua implementação então é tratada como uma função, e pode ser executada de forma mais ágil; 
  
* Lambda: É uma função sem declaração, criada no momento de sua utilização. É considerada uma forma de simplificar a utilização de interfaces funcionais;
<br/> Declaração: (argumento) -> (corpo);
  
* Reference Method: Realiza a referência a um determinado método de uma determinada classe de forma funcional a fim de utiliza-lo em determinado ponto do código. É considerada uma forma de simplificar a utilização de funções lambda;
<br/> Declaração: (classe) :: (método);

A Stream API utiliza funções lambda e reference methods e seu conjunto de operações para realizar o tratamento de fluxo de dados. Existem duas formas de operações envolvendo Stream APIs:

* Operações intermediárias (pipelines): São operações que podem ser encadeadas a fim de realizar o tratamento intermediário dos dados;

* Operações finais (terminal): São operações que executam executam a ação final de tratamento em um pipeline, sendo permitida apenas uma operação por stream;

### Métodos básicos

* nomeCollection.stream().forEach();
<br/>° Realiza uma iteração nos dados do stream.
  
* nomeCollection.stream().limit();
<br/>° Limita a quantidade de dados selecionados.
  
* nomeCollection.stream().collect();
<br/>° Permite reempacotar os dados do stream.

* nomeCollection.stream().filter();
<br/>° Permite filtrar os dados.
  
* nomeCollection.stream().map();
<br/>° Permite tranformar o tipo dos dados.
  
* nomeCollection.stream().mapToInt();
<br/>° Permite transformar o tipo dos dados, e aplicar funções a cada um deles.
  
* nomeCollection.stream().average();
<br/>° Retorna a média dos dados do stream;

* nomeCollection.stream().anyMatch();
<br/>° Retorna se algum dado do stream corresponde ao predicado fornecido.




