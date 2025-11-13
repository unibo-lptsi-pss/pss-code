package it.unibo.nested;

import java.util.Iterator;

public class Range2 implements Iterable<Integer> {
    private final int start;
    private final int stop;

    public Range2(final int start, final int stop) {
        this.start = start;
        this.stop = stop;
    }

    public Iterator<Integer> iterator() {
        return this.new RangeIterator();
    }

    private class RangeIterator implements Iterator<Integer> {
        private int current;

        public RangeIterator() {
            this.current = Range2.this.start; // this.current = start
        }

        public Integer next() { return this.current++; }

        public boolean hasNext() {
            // Accesso diretto ai campi non-statici della classe esterna!
            return this.current <= Range2.this.stop; // Equivalente: return current <= stop;
        }

        public void remove() { throw new UnsupportedOperationException(); }
    }
}
