package it.unibo.lambdas.first;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FilterUtility {
    public static <X> Set<X> filterAll(Collection<X> set, Filter<X> filter) {
        final Set<X> newSet = new LinkedHashSet<>();
        for (final X x : set) {
            if (filter.applyFilter(x)) {
                newSet.add(x);
            }
        }
        return newSet;
    }

    static void main() {
        final List<Integer> ls = List.of(10, 20, 30, 40, 50, 60);
        // Nota che il nome del metodo in Filter non è mai menzionato qui
        System.out.println(filterAll(ls, x -> x > 20)); // [30,40,50,60]
        System.out.println(filterAll(ls, x -> x > 20 && x < 60)); // [30,40,50]
        System.out.println(filterAll(ls, x -> x % 20 == 0)); // [20,40,60]
    }
}
