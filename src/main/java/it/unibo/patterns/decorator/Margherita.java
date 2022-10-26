package it.unibo.patterns.decorator;

/*
 * This is the basic Pizza of all
 */

public class Margherita implements Pizza {
	public int getCost(){
		return 650;
	}
	
	public String getIngredients(){
		return "Tomato, Mozzarella";
	}
}
