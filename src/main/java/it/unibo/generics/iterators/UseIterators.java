package it.unibo.generics.iterators;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.IO;

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
        printAll(iterator2); // Notare l'accesso uniforme! È uguale per Integer e Calendar
    }

    static <X> void printAll(Iterator<X> iterator) {
        while (iterator.hasNext()) {
            IO.println("Elemento : " + iterator.next());
        }
    }
}
