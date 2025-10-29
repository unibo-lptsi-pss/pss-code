package it.unibo.generics.iterators;

/* Itera tutti gli elementi di una List */
public class LListIterator<E> implements Iterator<E> {
    private LList<E> list; // Lista corrente

    public LListIterator(final LList<E> list) {
        this.list = list;
    }

    public E next() {
        final E element = this.list.getHead(); // Elemento da restituire
        this.list = this.list.getTail(); // Aggiorno la lista
        return element;
    }

    public boolean hasNext() {
        return this.list != null;
    }
}
