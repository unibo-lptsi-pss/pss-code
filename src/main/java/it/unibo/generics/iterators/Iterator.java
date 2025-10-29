package it.unibo.generics.iterators;

public interface Iterator<E> {
    /*
     * Restituisce il prossimo elemento dell'iterazione
     *
     * Nota: non è noto cosa succede se si chiama next()
     * quando hasNext() ha dato esito falso
     */
    E next();

    // dice se vi saranno altri elementi
    boolean hasNext();
}
