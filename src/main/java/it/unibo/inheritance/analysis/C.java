package it.unibo.inheritance.analysis;
import java.io.IO;

class C {
	protected int i;

	void m() {
		IO.println("C.m.. prima " + i);
		this.i++;
		IO.println("C.m.. dopo " + i);
	}
}
