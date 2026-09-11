package it.unibo.interfaces.more;
import java.io.IO;

public class FullInterfaceImpl implements FullInterface {
    public void doSomething(String s) {
        System.out.print(s.toUpperCase());
    }

    public static void main(String[] args){
        FullInterface impl = new FullInterfaceImpl();
        IO.println("E = " + FullInterface.E);
        IO.println("PI = " + FullInterface.PI());
        impl.doSomethingTwice("hello.");
    }
}
    