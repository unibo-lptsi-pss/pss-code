package it.unibo.generics.iterators;

public class LList<X> {
    private final X head;
    private final LList<X> tail;

    public LList(X head, LList<X> tail) {
        this.head = head;
        this.tail = tail;
    }

    public X getHead() { // Testa della lista
        return this.head;
    }

    public LList<X> getTail() { // Coda della lista
        return this.tail;
    }

    public int getLength() { // Dimensione della lista
        return (this.tail == null) ? 1 : 1 + this.tail.getLength();
    }

    public String toString() { // Rappr. a stringa
        return "|" + this.head + (this.tail == null ? "|" : this.tail.toString());
    }
}
