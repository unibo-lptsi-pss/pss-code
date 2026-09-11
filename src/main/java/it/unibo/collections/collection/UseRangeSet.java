package it.unibo.collections.collection;
import java.io.IO;

public class UseRangeSet {

	public static void main(String[] s) {
		// r è un Set a tutti gli effetti
		final RangeSet r = new RangeSet(0, 20);
		IO.println("Size of r: " + r.size());
		// ad esempio, lo uso per iterare
		for (final int i : r) {
			IO.println("Elem: " + i);
		}
		// ad esempio, uso la contains()
		IO.println(r.contains(15)); // true
		IO.println(r.contains(21)); // false
		// è comunque un set immutabile quindi niente add(), remove(),...
	}
}
