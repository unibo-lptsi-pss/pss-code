package it.unibo.encapsulation.bad;

public class UseCounter {
    public static void main(String[] args){
        Counter c = new Counter();
        c.increment();
        c.increment();
        System.out.println("Current value: " + c.value);
        c.value -= 10;
        System.out.println("Current value: " + c.value);
    } 
}
