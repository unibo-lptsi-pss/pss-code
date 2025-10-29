package it.unibo.generics.iterators;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UseIterators2 {

    public static <E> void printAll(final Iterator<E> iterator) {
        while (iterator.hasNext()) {
            System.out.println("Elemento : " + iterator.next());
        }
    }

    public static void main(String[] s) {
        final Iterator<Integer> iterator = new IntRangeIterator(5, 10);
        final LList<String> list = new LList<>("a", new LList<>("b", new LList<>("c", new LList<>("d", null))));
        final Iterator<String> iterator2 = new LListIterator<>(list);
        final Vector<Calendar> vector = new Vector<>();
        vector.addElement(new GregorianCalendar());
        vector.addElement(new GregorianCalendar());
        vector.addElement(new GregorianCalendar());
        final Iterator<Calendar> iterator3 = new VectorIterator<>(vector);
        // con inferenza:
        UseIterators2.printAll(iterator); // Equivale a: UseIterators2.<Integer>printAll(iterator)
        UseIterators2.printAll(iterator2); // Equivale a: UseIterators2.<String>printAll(iterator)
        UseIterators2.printAll(iterator3); // Equivale a: UseIterators2.<Calendar>printAll(iterator)
    }
}
