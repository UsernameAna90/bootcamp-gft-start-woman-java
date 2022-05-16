package map;

import java.util.*;

public class OdenacaoMap {
    public static void main(String[] args) {
        //Imprimindo nome dos livros em ordem aleatoria
        Map<String, Livro> livros = new HashMap<String, Livro>() {{
            put("l1", new Livro("Cidade dos Ossos", "Cassandra Clare", 250));
            put("l2", new Livro("Harry Potter", "J. K. Rowling", 280));
            put("l3", new Livro("Anjo Mecanico", "Cassandra Clare", 230));
            put("l4", new Livro("O Hobbit", "J. R. R. Tolkien", 330));
            put("l5", new Livro("Coraline", "Neil Gaiman", 170));
        }};

        Set<Map.Entry<String, Livro>> entries = livros.entrySet();
        for (Map.Entry<String, Livro> l : entries) {
            System.out.println("Livro: " + l.getValue().getNome());
        }

        //Imprimindo nome dos autores dos livros em ordem de entrada
        Map<String, Livro> livros2 = new LinkedHashMap<String, Livro>() {{
            put("l1", new Livro("O Hobbit", "J. R. R. Tolkien", 330));
            put("l2", new Livro("Harry Potter", "J. K. Rowling", 280));
            put("l3", new Livro("Coraline", "Neil Gaiman", 170));
            put("l4", new Livro("Cidade dos Ossos", "Cassandra Clare", 250));
            put("l5", new Livro("Anjo Mecanico", "Cassandra Clare", 230));
        }};

        System.out.println("--------------------------------");
        Set<Map.Entry<String, Livro>> entries1 = livros2.entrySet();
        for (Map.Entry<String, Livro> l : entries1) {
            System.out.println("Autor: " + l.getValue().getAutor());
        }

        //Imprimindo por ordem natural do nome dos livros (Comparator)
        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<Map.Entry<String, Livro>>(new ComparadorMap());
        livros3.addAll(livros2.entrySet());

        System.out.println("--------------------------------");
        for (Map.Entry<String, Livro> l : livros3) {
            System.out.println(l);
        }
    }
}
