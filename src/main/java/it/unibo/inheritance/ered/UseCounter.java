package it.unibo.inheritance.ered;
import java.io.IO;

public class UseCounter {
	public static void main(String[] s) {
		final Counter c = new Counter(0);

		IO.println(c.getValue()); // 0
		c.increment();
		c.increment();
		IO.println(c.getValue()); // 2
	}
}
