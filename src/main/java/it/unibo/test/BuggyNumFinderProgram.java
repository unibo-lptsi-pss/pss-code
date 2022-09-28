package it.unibo.test;

import java.util.Scanner;

public class BuggyNumFinderProgram {
    public static void main(String[] args){
        // Lettura input dall'utente
        Scanner in = new Scanner(System.in);
        System.out.print("Quanti numeri? ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i=0; i < n; i++) {
            System.out.print(i + "-esimo numero: ");
            array[i] = in.nextInt();
        }
        in.close();
        // Costruzione della UUT (Unit Under Test)
        BuggyNumFinder nf = new BuggyNumFinder();
        // Esecuzione della funzionalità
        nf.find(array);
        // Stampa dei risultati
        System.out.println("Smallest: " + nf.smallest);
        System.out.println("Largest: " + nf.largest);
    }
}