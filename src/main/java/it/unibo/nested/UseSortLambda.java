package it.unibo.nested;

import java.util.*;

public class UseSortLambda {
    static void main() {
        final List<Integer> list = Arrays.asList(10, 40, 7, 57, 13, 19, 21, 35);
        System.out.println(list);
        // classe anonima a partire da una interfaccia
        Collections.sort(list, (a, b) -> Integer.compare(a, b));
        System.out.println(list);

        Collections.sort(list, (a, b) -> Integer.compare(b, a));
        System.out.println(list);
    }
}
