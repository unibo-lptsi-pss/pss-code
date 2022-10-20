package it.unibo.patterns.abstractfactory.domo;

public class SimpleLampFactory implements LampFactory {
    @Override
    public Lamp createLamp() {
        return new SimpleLampImpl();
    }
}