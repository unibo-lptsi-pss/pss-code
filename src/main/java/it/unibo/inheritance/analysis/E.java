package it.unibo.inheritance.analysis;

class E {
	protected int i;

	void m() {
		this.i++;
		this.n();
	}
	void n() {
		this.i = this.i + 10;
	}
}
