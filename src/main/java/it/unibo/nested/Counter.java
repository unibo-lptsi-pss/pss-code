package it.unibo.nested;

public class Counter {
    private int value;
    public Counter(int initialValue) { this.value = initialValue; }
    public void increment() { this.value++; }
    public int getValue() { return this.value; }

    public static class Multi extends Counter {
        public Multi(int initialValue) { super(initialValue); }
        public void multiIncrement(int n) { super.value += n; }
    }

    public static class Bidirectional extends Counter {
        public Bidirectional(int initialValue) { super(initialValue); }
        public void decrement() { super.value--; }
    }
}
