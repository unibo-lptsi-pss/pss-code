package it.unibo.patterns.decorator.problem;

public class UsePizza {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        Pizza pizza2 = new Mushrooms(new Margherita());
        Pizza pizza3 = new Mushrooms(new Mushrooms(new Margherita()));
        Pizza pizza4 = new GlutFree(new Mushrooms(new Mushrooms(new Margherita())));       
    }
}
