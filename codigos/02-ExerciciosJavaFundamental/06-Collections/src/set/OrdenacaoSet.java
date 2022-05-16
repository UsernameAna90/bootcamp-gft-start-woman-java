package set;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        //Instanciando objetos
        Serie s1 = new Serie("GOT", "Fantasia, Acao", 60);
        Serie s2 = new Serie("Dark", "Ficcao Cientifica, Drama", 60);
        Serie s3 = new Serie("Breaking Bad", "Policial, Suspense", 50);

        //Criando HashSet
        Set<Serie> series = new HashSet<>(Arrays.asList(s1, s2, s3));

        //Verificando HashSet com Iteraror
        Iterator<Serie> iterator = series.iterator();

        while (iterator.hasNext()) {
            Serie next = iterator.next();
            System.out.println(next);
        }

        //Ordenar de acordo com a ordem de insercao
        Set<Serie> series2 = new LinkedHashSet<Serie>() {{
            add(new Serie("GOT", "Fantasia, Acao", 60));
            add(new Serie("Dark", "Ficcao Cientifica, Drama", 60));
            add(new Serie("Breaking Bad", "Policial, Suspense", 50));
        }};

        //Verificando LinkedHashSet com Iteraror
        Iterator<Serie> iterator2 = series2.iterator();

        System.out.println("--------------------------------------------");
        while (iterator2.hasNext()) {
            Serie next2 = iterator2.next();
            System.out.println(next2.getNome()+" - "+next2.getGenero()+" - "+next2.getDuracao());
        }

        //Ordenar de acordo com a ordem natural (Comparable)
        Set<Serie> series3 = new TreeSet<>(series2);

        //Verificando TreeSet
        System.out.println("--------------------------------------------");
        for (Serie s : series3) {
            System.out.println(s.getNome()+" - "+s.getGenero()+" - "+s.getDuracao());
        }

        //Ordenar de acordo com a ordem natural (Comparable)
        Set<Serie> series4 = new TreeSet<>(new ComparadorSet());
        series4.addAll(series);

        //Verificando TreeSet
        System.out.println("--------------------------------------------");
        for (Serie s : series4) {
            System.out.println(s.getNome()+" - "+s.getGenero()+" - "+s.getDuracao());
        }
    }
}
