package it.unibo.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class BuggyNumFinderJUnitTest {
    BuggyNumFinder numFinder;

    @BeforeEach 
    void setup(){
        System.out.println("Setup");
        numFinder = new BuggyNumFinder();
    }

    @Test
    public void someNumbers() {
        int[] input1 = new int[]{ 4, 25, 7, 9 };
        numFinder.find(input1);
        Assertions.assertEquals(4, numFinder.smallest);
        Assertions.assertEquals(25, numFinder.largest);
    }

    @Test
    public void positiveMonotonicallyIncreasingSequence() {
        int[] input1 = new int[]{ 10, 20, 30 };
        numFinder.find(input1);
        Assertions.assertEquals(10, numFinder.smallest);
        Assertions.assertEquals(30, numFinder.largest);
    }

    @Test
    public void positiveMonotonicallyDecreasingSequence() {
        int[] input1 = new int[]{ 30, 20, 10 };
        numFinder.find(input1);
        Assertions.assertEquals(4, numFinder.smallest);
        Assertions.assertEquals(25, numFinder.largest);
    }
}
