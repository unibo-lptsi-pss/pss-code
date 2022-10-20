package it.unibo.patterns.factory.domo;

public class SimpleLampFactory implements LampFactory {
    public Lamp createLamp() {
        return new SimpleLampImpl();
    }
}