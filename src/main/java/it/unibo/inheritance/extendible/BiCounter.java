package it.unibo.inheritance.extendible;

public class BiCounter extends ExtendibleCounter {

	public BiCounter(final int initialValue) {
		super(initialValue);
	}

	public void decrement() {
		/* Ora this.counter è accessibile */
		this.value--;
	}
}
