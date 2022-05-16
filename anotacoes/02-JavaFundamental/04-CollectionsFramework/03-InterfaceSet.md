# Interface Set

### HashSet

O HashSet armazena um conjunto de objetos de forma não ordenada, sem permitir valores duplicados. Dentre as implementações da interface Set, é a mais performática. Porém, o HashSet não trabalha com posições e portanto operações que envolvem o conhecimento da posição de um objeto não podem ser efetuadas.

* Padrão de declaração: 
<br/>° HashSet vazio: Set<tipo> nomeSet = new HashSet<>();
<br/>° HashSet inicializado: Set<tipo> nomeSet = new HashSet<>(Array.asList(valores ou objetos));
  
#### Métodos: 
  
* nomeLista.add(valor)
<br/>° Adiciona um valor ao set.
  
* nomeLista.contains(valor)
<br/>° Retorna true ou false caso um valor esteja ou não no set.
  
* nomeLista.remove(valor)
<br/>° Remove o valor informado.
  
* nomeLista.size()
<br/>° Retorna a quantidade de valores no set.
  
* nomeLista.clear()
<br/>° Esvazia a lista. Remove todos os valores.
  
* Collection.min(nomeLista)
<br/>° Retorna o menor valor do set.
  
* Collection.max(nomeLista)
<br/>° Retorna o maior valor do set.
  
 ### LinkedHashSet
  
 Diferentemente do HashSet, o LinkedHashSet ordena os objetos em ordem de inserção. Ele é um pouco menos performático, no enqtanto, permite trabalhar com posições.
  
 * Padrão de declaração: 
<br/>° LinkedHashSet vazio: Set<tipo> nomeSet = new LinkedHashSet<>();
<br/>° LinkedHashSet inicializado: Set<tipo> nomeSet = new LinkedHashSet<>(Array.asList(valores ou objetos));
  
#### Métodos: 
  
* Todos os métodos do Set.
  
* nomeLista.indexOf(valor)
<br/>° Retorna a posição de um valor.
  
* nomeLista.set(posição, valor)
<br/>° Substitui o valor que estiver na posição informada.
  
* nomeLista.get(posição)
<br/>° Retorna o valor que estiver na posição informada.
  
* nomeLista.remove(posição)
<br/>° Remove o valor que estiver na posição informada.
 
### TreeSet
  
 Por sua vez, o TreeSet ordena os objetos em sua ordem natural. É a menos performática das implementações mas herda todas as funcionalidades das implementações anteriores.
  
 * Padrão de declaração: 
<br/>° TreeSet vazio: Set<tipo> nomeSet = new TreeSet<>();
<br/>° TreeSet inicializado: Set<tipo> nomeSet = new TreeSet<>(Array.asList(valores ou objetos));
  
#### Métodos: 
  
* Todos os métodos do Set e do HashSet

