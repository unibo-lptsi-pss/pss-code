package it.unibo.generics.iterators;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UseIterators {
    public static void main(String[] s) {
        final Vector<Calendar> vector = new Vector<>();
        vector.addElement(new GregorianCalendar());
        vector.addElement(new GregorianCalendar());
        // creo 2 iteratori
        final Iterator<Integer> iterator1 = new IntRangeIterator(5, 10);
        final Iterator<Calendar> iterator2 = new VectorIterator<>(vector);
        // ne stampo il contenuto
        printAll(iterator1);
        printAll(iterator2);
    }

    static <X> void printAll(Iterator<X> iterator) {
        while (iterator.hasNext()) {
            System.out.println("Elemento : " + iterator.next());
        }
    }
}
