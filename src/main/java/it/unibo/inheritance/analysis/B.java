package it.unibo.inheritance.analysis;
import java.io.IO;

class B extends A {
	protected String s;

	public B(String s, int i) {
		super(i);
		IO.println("B().. prima " + this.s + " " + this.i);
		this.s = s;
		IO.println("B().. dopo " + this.s + " " + this.i);
	}
	
	public static void main(String[] s) {
		B b = new B("prova", 5); // Cosa succede?
	}
}
