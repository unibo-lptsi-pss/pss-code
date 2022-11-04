package it.unibo.patterns.decorator;

public class Sausage extends BasicIngredient {
	public Sausage(Pizza p) {
		super("Sausage", 150, p);
	}
}
