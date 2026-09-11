package it.unibo.encapsulation.bad;
import java.io.IO;

public class UseCounter {
    public static void main(String[] args){
        Counter c = new Counter();
        c.increment();
        c.increment();
        IO.println("Current value: " + c.value);
        c.value -= 10;
        IO.println("Current value: " + c.value);
    } 
}
