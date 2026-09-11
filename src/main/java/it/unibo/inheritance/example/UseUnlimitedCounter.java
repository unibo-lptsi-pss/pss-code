package it.unibo.inheritance.example;
import java.io.IO;

public class UseUnlimitedCounter {
	public static void main(String[] s) {
		final UnlimitedCounter uc = new UnlimitedCounter();
		IO.println("isOver: " + uc.isOver()); // false
		IO.println("LifeTime: " + uc.getDistanceToLimit());
		uc.increment();
		uc.increment();
		uc.increment();
		IO.println("isOver: " + uc.isOver()); // false
		IO.println("LifeTime: " + uc.getDistanceToLimit());
	}
}
