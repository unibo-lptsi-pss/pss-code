package it.unibo.generics.wildcard;

import it.unibo.generics.iterators.IntRangeIterator;
import it.unibo.generics.iterators.Iterator;
import java.io.IO;

public class Wildcard {
    // Metodo che usa la wildcard
    public static void printAll(Iterator<?> it) {
        while (it.hasNext()) {
            IO.println(it.next());
        }
    }

    // Analoga versione con metodo generico
    public static <T> void printAll2(Iterator<T> it) {
        while (it.hasNext()) {
            IO.println(it.next());
        }
    }

    // Quale versione preferibile?
    static void main() {
        Wildcard.printAll(new IntRangeIterator(1, 5));
        Wildcard.printAll2(new IntRangeIterator(1, 5));
        Wildcard.<Integer>printAll2(new IntRangeIterator(1, 5));
    }
}
