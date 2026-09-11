package it.unibo.collections.collection;

import java.util.*;
import java.io.IO;

public class UseFactories {
    public static void main(String[] s) {
        // Metodi statici di creazione per Set e List *immutabili*
        final Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6);
        IO.println(set);

        final List<String> list = List.of("a", "b", "c", "a");
        IO.println(list);

        final var set2 = Set.copyOf(list);
        IO.println(set2);
        // set2.add("d"); // UnsupportedOperationException
        IO.println(list.hashCode());
    }
}
