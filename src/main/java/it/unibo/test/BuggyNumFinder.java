package it.unibo.test;

public class BuggyNumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] numbers){
        for(int n : numbers){
            if(n < smallest) smallest = n;
            else if(n > largest) largest = n;
        }
    }

    public int getSmallest() {
        return this.smallest;
    }

    public int getLargest() {
        return this.largest;
    }
}