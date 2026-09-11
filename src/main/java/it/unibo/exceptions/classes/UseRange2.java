package it.unibo.exceptions.classes;
import java.io.IO;

public class UseRange2 {
	public static void main(String[] s) {
		RangeIterator r = null; // va creata fuori dal try..
		try {
			final int a = Integer.parseInt(s[0]);
			final int b = Integer.parseInt(s[1]);
			r = new RangeIterator(a, b);
		} catch (Exception e) { // catturo una qualsiasi Exception
			IO.println("Argomenti errati!");
			IO.println(e);
			System.exit(1); // abnormal termination
		}
		try {
			System.out.print(r.next() + " ");
			System.out.print(r.next() + " ");
			IO.println(r.next());
		} catch (java.util.NoSuchElementException e) {
			IO.println("Iterazione non corretta..");
			IO.println(e);
			System.exit(1); // abnormal termination
		}
		System.exit(0); // ok termination
	}
}
