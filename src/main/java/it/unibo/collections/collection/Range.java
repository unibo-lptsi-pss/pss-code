package it.unibo.collections.collection;

public class Range implements Iterable<Integer> {
    public final int start;
    public final int stop;

    public Range(final int start, final int stop) {
        this.start = start;
        this.stop = stop;
    }

    public java.util.Iterator<Integer> iterator() {
        return new RangeIterator(this);
    }
}
