package it.unibo.generics.iterators;

public class UseIntRangeIterator {
    public static void main(final String... s) {
        final LList<String> ls = new LList<>("10", new LList<>("20", new LList<>("30", null)));
        final LListIterator<String> it = new LListIterator<>(ls);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
