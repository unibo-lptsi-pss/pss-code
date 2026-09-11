package it.unibo.encapsulation.bad;
import java.io.IO;

public class CounterFunctions {
    static CounterValue increment(CounterValue cv) {
        return new CounterValue(cv.value + 1);
    }

    public static void main(String[] args){
        CounterValue result = CounterFunctions.increment(new CounterValue(10));
        IO.println("Result: " + result.value);
    } 
}
