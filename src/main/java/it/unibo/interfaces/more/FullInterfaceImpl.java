package it.unibo.interfaces.more;

public class FullInterfaceImpl implements FullInterface {
    public void doSomething(String s) {
        System.out.print(s.toUpperCase());
    }

    public static void main(String[] args){
        FullInterface impl = new FullInterfaceImpl();
        System.out.println("E = " + FullInterface.E);
        System.out.println("PI = " + FullInterface.PI());
        impl.doSomethingTwice("hello.");
    }
}
    