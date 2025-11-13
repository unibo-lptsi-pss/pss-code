package it.unibo.nested;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseSort {
    static void main() {
        final List<Integer> list = Arrays.asList(10, 40, 7, 57, 13, 19, 21, 35);
        System.out.println(list);
        // classe anonima a partire da una interfaccia
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b);
            }
        });
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(b, a);
            }
        });
        System.out.println(list);
    }
}
