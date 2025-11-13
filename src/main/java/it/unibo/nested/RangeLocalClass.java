package it.unibo.nested;

import java.util.Iterator;

public class RangeLocalClass implements Iterable<Integer> {
    private final int start;
    private final int stop;

    public RangeLocalClass(final int start, final int stop) {
        this.start = start;
        this.stop = stop;
    }

    public java.util.Iterator<Integer> iterator() {
        class RangeIterator implements Iterator<Integer> {
            private int current;

            public RangeIterator() { this.current = RangeLocalClass.this.start; }

            public Integer next() { return this.current++; }

            public boolean hasNext() { return this.current <= RangeLocalClass.this.stop; }

            public void remove() { }
        }
        return new RangeIterator();
    }
}
