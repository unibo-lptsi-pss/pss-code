package it.unibo.test;

public class BuggyNumFinderProgram2 {
    public static void main(String[] args){
        // Test case 1: some numbers
        BuggyNumFinder numFinder = new BuggyNumFinder();
        int[] input1 = new int[]{ 4, 25, 7, 9 };
        numFinder.find(input1);
        System.out.println("Apply to { 4, 25, 7, 9 } => " +
            " - smallest: " + numFinder.getSmallest() +
            " - largest: " + numFinder.getLargest());
        // Test case 2: monotonically increasing sequence
        int[] input2 = new int[]{ 10, 20, 30 };
        numFinder.find(input2);
        System.out.println("Apply to { 10, 20, 30 }  => " +
            " - smallest: " + numFinder.getSmallest() +
            " - largest: " + numFinder.getLargest());
        // Test case 3: monotonically decreasing sequence
        numFinder = new BuggyNumFinder();
        int[] input3 = new int[]{ 4, 3, 2, 1 };
        numFinder.find(input3);
        System.out.println("Apply to { 4, 3, 2, 1 }  => " +
            " - smallest: " + numFinder.getSmallest() +
            " - largest: " + numFinder.getLargest());
    }
}