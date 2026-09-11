package it.unibo.lifecycle;

import java.util.Random;
import java.io.IO;

public class GuessMyNumberApp {
	
	public static final int ATTEMPTS = 10;
	public static final int MAX_GUESS = 100;
	public static final int MIN_GUESS = 1;

	public static void main(String[] args) {
		int number = new Random().nextInt(MAX_GUESS - MIN_GUESS) + MIN_GUESS;
		for (int i = 1; i <= ATTEMPTS; i++){
			IO.println("Attempt no. "+i);
			IO.println("Insert your guess.. ");
			int guess = Integer.parseInt(System.console().readLine());
			if (guess == number){
				IO.println("You won!!");
				return;
			} else if (guess > number){
				IO.println("Your guess is greater..");
			} else {
				IO.println("Your guess is lower..");
			}
		}
		IO.println("Sorry, you lost!");
	}
}
