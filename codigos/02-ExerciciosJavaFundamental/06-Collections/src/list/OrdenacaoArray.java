package list;

import set.Serie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoArray {
    public static void main(String[] args) {
        //Criando ArrayList e instanciando series
        List<Serie> series = new ArrayList<Serie>(){{
            add(new Serie("GOT", "Fantasia, Acao", 60));
            add(new Serie("Dark", "Ficcao Cientifica, Drama", 60));
            add(new Serie("Breaking Bad", "Policial, Suspense", 50));
        }};

        //Verificando lista de series
        for (Serie s : series) {
            System.out.println(s);
        }

        //Ordenando objetos por tempo/nome(Comparable)
        Collections.sort(series);

        //Verificando lista de series
        System.out.println("--------------------------------------------------------");
        for (Serie s : series) {
            System.out.println(s);
        }

        //Ordenando objetos por genero (Comparator)
        series.sort(new Comparador());

        //Verificando lista de series
        System.out.println("--------------------------------------------------------");
        for (Serie s : series) {
            System.out.println(s);
        }
    }
}
