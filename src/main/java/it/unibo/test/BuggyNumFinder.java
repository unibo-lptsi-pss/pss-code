package it.unibo.test;

public class BuggyNumFinder {
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    public void find(int[] numbers){
        for(int n : numbers){
            if(n < smallest) smallest = n;
            else if(n > largest) largest = n;
        }
    }
}