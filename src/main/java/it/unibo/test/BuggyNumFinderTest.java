package it.unibo.test;

public class BuggyNumFinderTest {
    public static void main(String[] args){
        // Test case 1: some numbers
        BuggyNumFinder numFinder = new BuggyNumFinder();
        int[] input1 = new int[]{ 4, 25, 7, 9 };
        numFinder.find(input1);
        if(!(numFinder.getSmallest() == 4 && numFinder.getLargest() == 25)){
            System.out.println("Test Case #1 failed");
        }
        // Test case 2: monotonically increasing sequence
        int[] input2 = new int[]{ 10, 20, 30 };
        numFinder.find(input2);
        if(!(numFinder.getSmallest() == 10 && numFinder.getLargest() == 30)){
            System.out.println("Test Case #2 failed");
        }
        // Test case 3: monotonically decreasing sequence
        numFinder = new BuggyNumFinder();
        int[] input3 = new int[]{ 4, 3, 2, 1 };
        numFinder.find(input3);
        if(!(numFinder.getSmallest() == 1 && numFinder.getLargest() == 4)){
            System.out.println("Test Case #3 failed");
        }
    }
}