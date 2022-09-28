package it.unibo.test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BuggyNumFinderProgram {
    public static void main(String[] args){
        // Get inputs by reading integers from stdin
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for(int i=0; i < n; i++) {
            System.out.print(i + "th number: ");
            list.add(in.nextInt());
        }
        in.close();
        
        // Build the SUT (System Under Test)
        BuggyNumFinder nf = new BuggyNumFinder();
        
        // Launch the system
        nf.find(list.stream().mapToInt(Integer::intValue).toArray());
        
        // Print out the results
        System.out.println("Smallest: " + nf.smallest);
        System.out.println("Largest: " + nf.largest);
    }
}