package map;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamAPI2 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = new ArrayList<String>(Arrays.asList("134", "65", "78", "15", "32", "56", "98", "40", "19"));

        //Imprimir lista de numeros aleatorios usando forEach
        /*
        numerosAleatorios.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }});*/

        // numerosAleatorios.stream().forEach(item -> System.out.println(item));

        // numerosAleatorios.forEach(item -> System.out.println(item));

        //numerosAleatorios.forEach(System.out::println);

        //Coletar os primeiros cinco numeros e inserilos dentro de um set
        /*
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
         */

        Set<String> primeirosNumeros = numerosAleatorios.stream()
                .limit(5)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new)); //Para ordenar, é preciso usar o HashSet
        //primeirosNumeros.forEach(System.out::println);

        //Tranformar o tipo dos valores da lista para "String" e armazena-los em uma nova lista
        List<Integer> numerosInt = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        //numerosInt.forEach(System.out::println);

        // Filtrar a lista de integer por valores pares e maiores de 20
        List<Integer> numerosFiltrados = numerosInt.stream()
                .filter(integer -> integer % 2 == 0 && integer > 20)
                .collect(Collectors.toList());
        //for (Integer item : numerosFiltrados) System.out.println(item);

        //Encontrar a média dos valores da lista
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

    }
}