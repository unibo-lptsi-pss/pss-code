package it.unibo.patterns.decorator.problem;

public abstract class Ingredient implements Pizza {
    
    private final Pizza pizza;
    
    public Ingredient(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.singleCost() + this.pizza.getCost();
    }

    @Override
    public String getIngredients() {
        return this.pizza.getIngredients()+", "+name();
    }
    
    protected abstract int singleCost();
    
    protected abstract String name();

}
