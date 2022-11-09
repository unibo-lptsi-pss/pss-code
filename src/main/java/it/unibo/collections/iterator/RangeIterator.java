package it.unibo.collections.iterator;

class RangeIterator implements java.util.Iterator<Integer> {
    private int current;
    private final int stop;

    public RangeIterator(final Range range) {
        this.current = range.start;
        this.stop = range.stop;
    }

    public Integer next() {
        return this.current++;
    }

    public boolean hasNext() {
        return this.current <= this.stop;
    }

    public void remove() {
    }
}
