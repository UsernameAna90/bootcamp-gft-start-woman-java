# Interface Map

A interface map não estende da interface Collection, mas faz parte do Framework Collection. Está presente no pacote **java.util**, e suas implementações mapeiam valores para chave. Ou seja, para cada objeto armazenado há uma chave que a identifica. A interface Map não aceita chaves repetidas, mas valores repetidos podem se fazer presentes.

### Implementações

* HashMap: Armazena em ordem aleatória; Aceita chave nula; Maior performance;
<br/>° Map<tipoChave, tipoValor> nomeMap = new HashMap<>();

* LinkedHashMap:  Armazena em ordem de inserção; Aceita chave nula;
<br/>° Map<tipoChave, tipoValor> nomeMap = new LinkedHashMap<>();

* TreeMap: Armazena em ordem natural; Não aceita chave nula; Menor performance;
<br/>° Map<tipoChave, tipoValor> nomeMap = new TreeMap<>();

### Métodos básicos

* nomeMap.put() - Adiciona um valor;

* nomeMap.toString() - Permite printar as chaves e valores;

* nomeMap.containsKey() - Verifica se uma chave está ou não presente;

* nomeMap.get(chave) - Retorna o valor relacionado a chave;

* nomeMap.keySet() - Retorna um set das chaves;

* nomeMap.values() - Retorna uma collection dos valores;

* nomeMap.size() - Retorna a quantidade de objetos;

* nomeMap.remove() - Remove um objeto;

* nomeMap.clear() - Remove todos os objetos;

### entrySet

O método entrySet retorna um set de todos os objetos mapeados no mapa hash, ou seja, retorna um conjunto de pares de chaves e valores. Ele é utilizado quando se quer trabalhar com chaves e valores separadamente, mas de forma que se possa utiliza-los simultâneamente.

* Declaração:
<br/>° Set<Map.Entry<tipoChave, tipoValor>> entries = nomeMap.entrySet();

* Métodos:
<br/>° entries.getKey() - Retorna uma chave;
<br/>° entries.getValue() - Retorna um valor;
