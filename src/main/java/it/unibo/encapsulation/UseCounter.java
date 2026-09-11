package it.unibo.encapsulation;
import java.io.IO;

public class UseCounter {
	
	public static void main(String[] args) {
		Counter c = new Counter();
		IO.println(c.getValue()); // 0
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		IO.println(c.getValue()); // 4
	}
}
