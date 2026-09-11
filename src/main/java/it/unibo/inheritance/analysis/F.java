package it.unibo.inheritance.analysis;
import java.io.IO;

class F extends E {
	void n() {
		this.i = this.i + 100;
	}
	public static void main(String[] s) {
		F f = new F();
		f.i = 10;
		f.m();
		IO.println("" + f.i);
	}
}
