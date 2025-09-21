package it.unibo.lifecycle.modeling;

import java.util.Scanner;

public class IOManager {
    private final Scanner scanner;

    public IOManager() {
        this.scanner = new Scanner(System.in);
    }

    public void printLine(String text) {
        System.out.println(text);
    }

    public int readIntInRange(int min, int max) {
        while (true) {
            String line = scanner.nextLine();
            int value = Integer.parseInt(line.trim());
            if (value < min || value > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } else {
                return value;
            }
        }
    }
}
