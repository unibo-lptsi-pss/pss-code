package it.unibo.patterns.decorator.problem;

public class Mushrooms extends Ingredient {
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected int singleCost() {
        return 100;
    }

    @Override
    protected String name() {
        return "Mushrooms";
    }
}
