package it.unibo.patterns.decorator;

public class Mushrooms extends BasicIngredient {
	
	public Mushrooms(Pizza p){
		super("Mushrooms", 100, p);
	}	
}
