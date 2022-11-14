package it.unibo.collections.collection;

public class UseRangeSet {

	public static void main(String[] s) {
		// r è un Set a tutti gli effetti
		final RangeSet r = new RangeSet(0, 20);
		System.out.println("Size of r: " + r.size());
		// ad esempio, lo uso per iterare
		for (final int i : r) {
			System.out.println("Elem: " + i);
		}
		// ad esempio, uso la contains()
		System.out.println(r.contains(15)); // true
		System.out.println(r.contains(21)); // false
		// è comunque un set immutabile quindi niente add(), remove(),...
	}
}
