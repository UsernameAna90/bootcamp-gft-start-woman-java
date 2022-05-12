# Métodos

Os métodos são funções disponibilizadas por uma classe, a fim de executarem determinados comportamentos. 

### Padrão de definição

< visibilidade > < tipo > < modificador > < retorno > < nome > (< parâmetros >) {<br/>
<pre>< bloco de comandos >;</pre>
}

* Visibilidade: public, protected e private. 

* Tipo: concreto ou abstrato. 

* Modificador: static ou final.

* Retorno: O tipo de dado que será retornado, ou void.

* Nome: Nome do método.
<br/> ° Case sensitive;
<br/> ° Não deve iniciar com números;
<br/> ° Não deve conter espaço;
<br/> ° Não deve ser palavra reservada;
<br/> ° Caracteres especiais são proibidos;
<br/> ° Deve iniciar com letra minúscula;
<br/> ° Deve usar notação CamelCase;
<br/> ° Deve ser expressivo;

### Requisição do método

Para utilizar um método, é necessário realizar uma requisição à classe ou ao objeto que detém o método. A requisição é também chamada de "mensagem".

* Requisição feita à classe: NomeClasse.nomeMetodo()

* Requisição feita ao objeto: nomeObjeto.nomeMetodo()
