package it.unibo.patterns.factory.domo;

public class AdvancedLampFactory implements LampFactory {
    public Lamp createLamp() {
        return new AdvancedLampImpl();
    }
}