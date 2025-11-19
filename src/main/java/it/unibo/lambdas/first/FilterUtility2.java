package it.unibo.lambdas.first;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class FilterUtility2 {
    public static <X> Set<X> filterAll(Collection<X> set, Predicate<X> filter) {
        final Set<X> newSet = new LinkedHashSet<>();
        for (final X x : set) {
            if (filter.test(x)) {
                newSet.add(x);
            }
        }
        return newSet;
    }

    static void main() {
        final List<Integer> ls = List.of(10, 20, 30, 40, 50, 60);
        // Note that the name of the method in Filter is never mentioned here
        System.out.println(filterAll(ls, x -> x > 20)); // [30,40,50,60]
        System.out.println(filterAll(ls, x -> x > 20 && x < 60)); // [30,40,50]
        System.out.println(filterAll(ls, x -> x % 20 == 0)); // [20,40,60]
    }
}
