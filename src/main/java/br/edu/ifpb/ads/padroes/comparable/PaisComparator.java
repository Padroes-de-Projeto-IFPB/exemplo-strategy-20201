package br.edu.ifpb.ads.padroes.comparable;

import java.util.Comparator;

public class PaisComparator implements Comparator  {
    @Override
    public int compare(Object o1, Object o2) {
        Pais p1 = (Pais)o1;
        Pais p2 = (Pais)o2;
        return p1.getNome().compareTo(p2.getNome());
    }
}
