package it.unibo.inheritance.pre;

public class UseCounter {
	public static void main(String[] s) {
		final Counter c = new Counter(0);

		System.out.println(c.getValue()); // 0
		c.increment();
		c.increment();
		System.out.println(c.getValue()); // 2
	}
}
