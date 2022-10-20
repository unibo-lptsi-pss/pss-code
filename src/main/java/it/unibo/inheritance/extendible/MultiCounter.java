package it.unibo.inheritance.extendible;

public class MultiCounter extends ExtendibleCounter {

    public MultiCounter(final int initialValue) {
        super(initialValue);
    }

    public void multiIncrement(final int n) {
        // Ora realizzabile più efficientemente
        if (n > 0) {
            this.value = this.value + n;
        }
    }
}
