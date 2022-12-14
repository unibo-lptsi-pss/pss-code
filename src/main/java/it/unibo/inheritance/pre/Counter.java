package it.unibo.inheritance.pre;

public class Counter {

	private int value;

	public Counter(final int initialValue) {
		this.value = initialValue;
	}

	public void increment() {
		this.value++;
	}

	public int getValue() {
		return this.value;
	}
}
