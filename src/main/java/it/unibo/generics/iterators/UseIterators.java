package it.unibo.generics.iterators;

public class UseIterators {
	public static void main(String[] s) {
		final Vector<java.util.Date> vector = new Vector<>();
		vector.addElement(new java.util.Date());
		vector.addElement(new java.util.Date());

		// creo 2 iteratori..
		final Iterator<Integer> iterator1 = new IntRangeIterator(5, 10);
		final Iterator<java.util.Date> iterator2 = new VectorIterator<>(vector);

		// ne stampo il contenuto..
		printAll(iterator1);
		printAll(iterator2);
	}

	static <X> void printAll(Iterator<X> iterator) {
		while (iterator.hasNext()) {
			System.out.println("Elemento : " + iterator.next());
		}
	}
}
