# Iterações e Ordenações em um ArrayList

### Iterações

Iterações em um ArrayList podem ser realizadas por meio de laços de repetição, como o forEach que foi criado objetivando especialmente a iteração em arrays e collections. 
<br/>
Também pode ser realizada por meio de um objeto "Iterator", que realiza passagem sequencial através de uma estrutura de dados.

#### Padrão de declaração:
* Iterator<tipo> nomeIterator = new nomeLista.iterator()
  
#### Métodos básicos:
* nomeIterator.hasNext() - Verifica se há próximo valor na lista.
  
* nomeIterator.next() - Retorna o próximo valor da lista.
  
### Ordenações
  
Para que seja posivel alterar as posições dos elementos de uma lista, é necessário implementar as interfaces genéricas "Comparable" e "Comparator", presentes no pacote **java.util**.
<br/>
A diferença entre as interfaces é que a interface Comparable fornece a sequência de classificação única, enquanto a interface Comparator fornece as várias sequências de classificação.
  
#### Padrão de declação: 
* Comparable: Implementa-se na classe cujos objetos se quer comparar.
<br/>° class NomeClasse implements Comparable< NomeClasse >
* Comparator: Implementa-se em uma classe a parte da classe cujos objetos se quer comparar.
<br/>° class NomeComparator implements Comparator< NomeClasse >
  
#### Métodos:
* Comparable - compareTo: Compara o objeto que chamou o método a um objeto passado como parâmetro.
<br/>° public int compareTo(classe objeto)
  
* Comparator - compare(): Aplicada lógica de classificação comparando cada elemento da collection.
<br/>° public int compare(classe objeto1, classe objeto2)
  
#### Ordenando listas:
* Comparable
<br/>° Collections.sort(nomeLista)
  
* Comparator:
<br/>° Collections.sort(nomeLista, new NomeComparator())
<br/>° nomeLista.sort(new NomeComparator())
