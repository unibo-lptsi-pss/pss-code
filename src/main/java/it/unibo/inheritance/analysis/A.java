package it.unibo.inheritance.analysis;
import java.io.IO;

class A {
	protected int i;

	public A(int i) {
		IO.println("A().. prima " + this.i);
		this.i = i;
		IO.println("A().. dopo " + this.i);
	}
}
