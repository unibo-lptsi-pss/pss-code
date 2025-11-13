package it.unibo.nested;

import java.util.Iterator;

public class RangeAnonymous implements Iterable<Integer> {
    private final int start;
    private final int stop;

    public RangeAnonymous(final int start, final int stop) {
        this.start = start;
        this.stop = stop;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            // Non ci può essere costruttore!
            private int current = start; // o anche Range4.this.start

            public Integer next() {
                return current++;
            }

            public boolean hasNext() {
                return current <= stop; // o anche Range4.this.stop
            }

            public void remove() { }
        }; // questo è il ; del return
    }
}
