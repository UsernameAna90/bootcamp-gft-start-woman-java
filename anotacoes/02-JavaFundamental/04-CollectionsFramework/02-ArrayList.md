# ArrayList

O ArrayList é uma implementação da interface List que permite criar collections, ou conjuntos de dados em uma unidade única que pode ser chamada de lista, de maneira ordenada e cujo tamanho pode aumentar ou diminuir. Ele faz parte do pacote **java.util.List**, que necessita ser importado para que seja possível implementar o ArrayList. 
<br/>
Uma coleção do tipo ArrayList permite que os objetos nela armazenados sejam acessados rápidamente, por isso seu uso é indicado quando se é necessário realizar mais operações de consulta.

### Implementação

* ArrayList vazio:
<br/>° List<tipo> nomeLista = new ArrayList<>():
  
* ArrayList com dados: 
<br/>° List<tipo> nomeLista = new ArrayList<>(Array.asList(valor1, valor2, valorN)):
  
### Métodos básicos
  
* nomeLista.add(valor)
<br/>° Adiciona um valor na posição à direita da lista.
  
* nomeLista.indexOf(valor)
<br/>° Retorna a posição de um valor.
  
* nomeLista.set(posição, valor)
<br/>° Substitui o valor que estiver na posição informada.
  
* nomeLista.contains(valor)
<br/>° Retorna true ou false caso um valor esteja ou não na lista.
  
* nomeLista.get(posição)
<br/>° Retorna o valor que estiver na posição informada.
  
* nomeLista.remove(posição)
<br/>° Remove o valor que estiver na posição informada.
  
* nomeLista.size()
<br/>° Retorna a quantidade de valores na lista.
  
* nomeLista.clear()
<br/>° Esvazia a lista. Remove todos os valores.
  
* Collection.min(nomeLista)
<br/>° Retorna o menor valor da lista.
  
* Collection.max(nomeLista)
<br/>° Retorna o maior valor da lista.
