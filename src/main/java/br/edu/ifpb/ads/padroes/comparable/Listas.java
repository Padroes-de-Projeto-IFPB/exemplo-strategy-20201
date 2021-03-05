package br.edu.ifpb.ads.padroes.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<String>();
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Manga");
        frutas.add("Abacaxi");
        frutas.sort(new FrutasComparatorReversed());

        for (String fruta : frutas){
            System.out.println(fruta);
        }

    }

}
