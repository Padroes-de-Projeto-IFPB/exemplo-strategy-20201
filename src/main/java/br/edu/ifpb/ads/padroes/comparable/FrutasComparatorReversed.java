package br.edu.ifpb.ads.padroes.comparable;

import java.util.Comparator;

public class FrutasComparatorReversed implements Comparator {
    public int compare(Object o1, Object o2) {
        return o2.toString().compareTo(o1.toString());
    }
}
