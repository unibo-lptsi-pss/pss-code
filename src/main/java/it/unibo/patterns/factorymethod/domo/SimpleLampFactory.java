package it.unibo.patterns.factorymethod.domo;

public class SimpleLampFactory implements LampFactory {
    @Override
    public Lamp createLamp() {
        return new SimpleLampImpl();
    }
}