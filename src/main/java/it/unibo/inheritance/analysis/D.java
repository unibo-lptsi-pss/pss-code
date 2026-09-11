package it.unibo.inheritance.analysis;
import java.io.IO;

class D extends C {
	D(int i) {
		this.i = i;
	}
	void m() {
		super.m();
		IO.println("D.m.. dopo " + this.i);
	}
	public static void main(String[] s) {
		new D(5).m(); // Cosa succede?
	}
}
