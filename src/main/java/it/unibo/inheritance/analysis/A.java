package it.unibo.inheritance.analysis;

class A {
	protected int i;

	public A(int i) {
		System.out.println("A().. prima " + this.i);
		this.i = i;
		System.out.println("A().. dopo " + this.i);
	}
}
