package br.edu.ifpb.ads.padroes.comparable;

import java.util.Comparator;

public class FrutasComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
