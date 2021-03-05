package br.edu.ifpb.ads.padroes.comparable;

import java.util.ArrayList;
import java.util.List;

public class Paises {
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("BR","Brasil"));
        paises.add(new Pais("AR","Argentina"));
        paises.add(new Pais("EUA","Estados Unidos"));

        paises.sort(new PaisComparator());

        for (Pais pais: paises) {
            System.out.println(pais.getNome());
        }

    }
}
