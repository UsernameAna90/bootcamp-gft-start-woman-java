package map;

import java.util.*;
import java.util.function.Function;

public class StreamAPI {
    public static void main(String[] args) {
        //Imprimir agenda com contatos organizados de forma aleatoria
        Map<Integer, Contato> agenda = new HashMap<Integer, Contato>(){{
            put(1, new Contato("Sebastian", 999661234L));
            put(2, new Contato("Artemis", 999665678L));
            put(3, new Contato("Alice", 999669101L));
            put(4, new Contato("Hector", 999661213L));
        }};
        Set<Map.Entry<Integer, Contato>> entries = agenda.entrySet();
        for (Map.Entry<Integer, Contato> c : entries) {
            System.out.println("Id: "+c.getKey()+", Nome: "+c.getValue().getNome()+", Numero: "+c.getValue().getNumero());
        }

        //Imprimir agenda com contatos organizados em ordem de isnserção
        Map<Integer, Contato> agenda2 = new LinkedHashMap<Integer, Contato>() {{
            put(2, new Contato("Artemis", 999665678L));
            put(1, new Contato("Sebastian", 999661234L));
            put(4, new Contato("Hector", 999661213L));
            put(3, new Contato("Alice", 999669101L));
        }};
        System.out.println("--------------------------------------------------------------------------------");
        Set<Map.Entry<Integer, Contato>> entries1 = agenda2.entrySet();
        for (Map.Entry<Integer, Contato> c : entries1) {
            System.out.println("Id: "+c.getKey()+", Nome: "+c.getValue().getNome()+", Numero: "+c.getValue().getNumero());
        }

        //Imprimir agenda com contatos organizados em ordem natural das chaves
        Map<Integer, Contato> agenda3 = new TreeMap<>(agenda2);
        Set<Map.Entry<Integer, Contato>> entries2 = agenda3.entrySet();

        System.out.println("--------------------------------------------------------------------------------");
        for (Map.Entry<Integer, Contato> c : entries2) {
            System.out.println("Id: "+c.getKey()+", Nome: "+c.getValue().getNome()+", Numero: "+c.getValue().getNumero());
        }

        //Imprimir agenda com contatos organizados em ordem natural dos nomes utilizando classe anônima
        /*
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<Map.Entry<Integer, Contato>>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return c1.getValue().getNome().compareToIgnoreCase(c2.getValue().getNome());
            }
        });
         */

        //Imprimir agenda com contatos organizados em ordem natural dos nomes utilizando interface funcional
        /*
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<Map.Entry<Integer, Contato>>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, String>() {
                    @Override
                    public String apply(Map.Entry<Integer, Contato> contato) {
                        return contato.getValue().getNome();
                    }
                }));
         */

        //Imprimir agenda com contatos organizados em ordem natural dos nomes utilizando lambda
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<Map.Entry<Integer, Contato>>(Comparator.comparing(
                 contato -> contato.getValue().getNome()));
        agenda4.addAll(agenda3.entrySet());

        System.out.println("--------------------------------------------------------------------------------");
        for (Map.Entry<Integer, Contato> c : agenda4) {
            System.out.println("Id: "+c.getKey()+", Nome: "+c.getValue().getNome()+", Numero: "+c.getValue().getNumero());
        }

    }
}
