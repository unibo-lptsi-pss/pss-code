package it.unibo.patterns.factory.domo;

public class SimpleLampFactory implements LampFactory {
    @Override
    public Lamp createLamp() {
        return new SimpleLampImpl();
    }
}