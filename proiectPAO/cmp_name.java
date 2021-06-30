package pao;

import java.util.Comparator;

public class cmp_name implements Comparator {
    @Override

    public int compare(Object o1, Object o2) {
        Acceptat s1 = (Acceptat) o1;
        Acceptat s2 = (Acceptat) o2;

        return s1.aplicant.nume.getNume().compareTo(s2.aplicant.nume.getNume());

    }
}