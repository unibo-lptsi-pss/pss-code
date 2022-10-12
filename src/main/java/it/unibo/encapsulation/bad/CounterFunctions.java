package it.unibo.encapsulation.bad;

public class CounterFunctions {
    static CounterValue increment(CounterValue cv) {
        return new CounterValue(cv.value + 1);
    }

    public static void main(String[] args){
        CounterValue result = CounterFunctions.increment(new CounterValue(10));
        System.out.println("Result: " + result.value);
    } 
}
