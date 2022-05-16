package map;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        //Criando HashMap
        Map<String, Double> produtos = new HashMap<String, Double>(){{
            put("mouse", 20.50);
            put("placa mae", 120.95);
            put("teclado", 30.25);
            put("monitor", 150.80);
            put("memoria HD", 270.0);
            put("memoria RAM", 180.60);
        }};

        //Verificando Map
        //System.out.println(produtos.toString());

        //Encontrando produto de maior preco
        double maiorPreco = Collections.max(produtos.values());
        String produtoMaiorPreco = "";

        Set<Map.Entry<String, Double>> entries = produtos.entrySet(); //Criando entrySet
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(maiorPreco)){
                produtoMaiorPreco = entry.getKey();
            }
        }
        System.out.println("Produto com maior preco: " + produtoMaiorPreco + " - R$" + maiorPreco);

        //Encontrando produto de menor preco
        double menorPreco = Collections.min(produtos.values());
        String produtoMenorPreco = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(menorPreco)) {
                produtoMenorPreco = entry.getKey();
            }
        }
        System.out.println("Produto com menor preco: " + produtoMenorPreco + " - R$" + menorPreco);

        //Somando precos
        double soma = 0;
        Iterator<Double> iterator = produtos.values().iterator();

        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma do valor total dos produtos: " + soma);

        //Ordenando por ordem de insercao
        Map<String, Double> produtos2 = new LinkedHashMap<String, Double>(){{
            put("memoria HD", 270.0);
            put("placa mae", 120.95);
            put("mouse", 20.50);
            put("teclado", 30.25);
            put("monitor", 150.80);
            put("memoria RAM", 180.60);
        }};

        System.out.println("------------------------------------");
        Set<Map.Entry<String, Double>> entries1 = produtos2.entrySet();
        for (Map.Entry<String, Double> p : entries1) {
            System.out.println(p.getKey() +" - R$"+ p.getValue());
        }

        //Ordenando pela ordem natural das chaves
        Map<String, Double> produtos3 = new TreeMap<>(produtos2);

        System.out.println("------------------------------------");
        Set<Map.Entry<String, Double>> entries2 = produtos3.entrySet();
        for (Map.Entry<String, Double> p : entries2) {
            System.out.println(p.getKey() +" - R$"+ p.getValue());
        }
    }
}
