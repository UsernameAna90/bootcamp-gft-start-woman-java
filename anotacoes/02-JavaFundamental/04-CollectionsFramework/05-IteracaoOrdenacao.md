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
  

  
* Comparator - compare(): Aplicada lógica de classificação comparando cada elemento da collection. O Comparator deve ser implementado em uma classe a parte daquela que detém os objetos fazendo uso do Comparator.
<br/>° public int compare(classe objeto1, classe objeto2)
  
### Ordenando listas (ArrayList):
* Comparable
<br/>° Collections.sort(nomeLista)
  
* Comparator:
<br/>° Collections.sort(nomeLista, new NomeComparator())
<br/>° nomeLista.sort(new NomeComparator())
  
### Ordenando sets (LinkedHashSet e TreeSet):
  
* LinkedHashSet: Ordena os objetos de acordo com sua ordem de inserção, desde que a classe dos objetos tenha sobreposto os métodos "Equals" e "HashMap". Para ordenar um set, basta passá-lo como parâmento na instanciacao de um novo LinkedHashSet.
<br/>° Set<Classe> nomeSet = new LinkedHashSet<>(nomeSetParaOrdenar);
  
* TreeSet: Ordena os objetos de acordo com sua ordem natural, desde que a classe dos objetos possua implementado o Comparable e seu método compareTo, ou então desde que exista uma classe separada que implementa o Comparator e seu método compare apontando para a classe dos objetos.
<br/>° Comparable: Set<Classe> nomeSet = new TreeSet<>(nomeSetParaOrdenar);
<br/>° Comparator: Set<Classe> nomeSet = new TreeSet<>(new NomeComparator()); nomeSet.addAll(nomeSetParaOrdenar);
  
### Ordenando maps (LinkedHashMap e TreeMap):

* LinkedHashMap: Ordena os objetos de acordo com sua ordem de inserção, desde que a classe dos objetos tenha sobreposto os métodos "Equals" e "HashMap". Para ordenar um set, basta passá-lo como parâmento na instanciacao de um novo LinkedHashSet.
<br/>° Map<tipoChave tipoValor> nomeMap = new LinkedHashMap<>(nomeMapParaOrdenar);

* TreeMap: Ordena os objetos de acordo com a ordem natural das suas chaves, desde que a classe dos objetos tenha sobreposto os métodos "Equals" e "HashMap". Para ordenar um set, basta passá-lo como parâmento na instanciacao de um novo TreeMap. Mas para ordená-lo de acordo com um determinado valor, é necessário implementar a interface "Comparator" e passá-la como parâmento na instanciacao de um novo SetMap
<br/>° Comparator: Set<Map.Entry<tipoChave tipoValor>> nomeSet = new TreeSet<>(new NomeComparator()); 
<br/>° nomeSet.addAll(nomeSetParaOrdenar.entrySet());
<br/>
Obs: HashSet e HashMap não trabalham com posições, por isso não se pode ordena-los diretamente.
  
