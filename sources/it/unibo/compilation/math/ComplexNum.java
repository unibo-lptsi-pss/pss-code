package it.unibo.compilation.math;

class ComplexNum {

    double re;
    double im;

    void build(final double re, final double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(final ComplexNum num) {
        return re == num.re && im == num.im;
    }

    void add(final ComplexNum num) {
        re += num.re;
        im += num.im;
    }

    String toStringRep() {
        return re + (im > 0 ? "+" : "") + im + "i";
    }
}
