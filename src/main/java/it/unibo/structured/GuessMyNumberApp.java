package it.unibo.structured;

import java.util.Random;
import java.io.IO;

public class GuessMyNumberApp {
	public static void main(String[] args) {
		int number = new Random().nextInt(99) + 1;
		for (int i = 1; i <= 10; i++){
			IO.println("Attempt no. "+i);
			IO.println("Insert your guess.. ");
			int guess = Integer.parseInt(System.console().readLine());
			if (guess == number){
				IO.println("You won!!");
				return;
			} else if (guess > number){
				IO.println("Your guess is greater, try again..");
			} else {
				IO.println("Your guess is lower, try again..");
			}
		}
	}
}
