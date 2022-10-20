package it.unibo.interfaces.more;

public interface FullInterface {
    void doSomething(String s);
    // da Java 8
    double E = 2.718282; // implicitamente public, static, final
    default void doSomethingTwice(String s) { doSomething(s); doSomething(s); }
    static double PI() { return Math.PI; }
}
    