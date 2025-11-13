package it.unibo.nested;

public class Outer {
    private final int i;

    public Outer(int i) {
        this.i = i;
    }

    public Inner createInner() {
        return new Inner();
        // oppure: return this.new Inner();
    }

    public class Inner {
        private int j = 0;

        public void update() {
            this.j = this.j + Outer.this.i; // si usa l'oggetto di outer
        }

        public int getValue() {
            return this.j;
        }
    }
}
