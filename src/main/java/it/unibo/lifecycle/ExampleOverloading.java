package it.unibo.lifecycle;
import java.io.IO;

class ExampleOverloading {
	static int m(double a, int b) { return 1; }
	static int m(int a, double b) { return 2; }
	static int m2(double a, double b) { return 1; }
	static int m2(int a, int b) { return 2; }

	public static void main(String[] s) {
		// IO.println(""+m(1, 1));      // ERROR: reference to m is AMBIGUOUS
		// IO.println(""+m(1.5, 1.5));  // ERROR: no suitable method found for m(Double,Double)
		IO.println("" + m(1.5, 1));
		IO.println("" + m((float)1, 1));
		IO.println("" + m(1, 1.5));
		IO.println("" + m2(1.5, 1.5)); // 1
		IO.println("" + m2(1, 1));     // 2
	}
}
