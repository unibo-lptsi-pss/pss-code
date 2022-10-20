package it.unibo.patterns.abstractfactory.domo;

public class AdvancedLampFactory implements LampFactory {
    public Lamp createLamp() {
        return new AdvancedLampImpl();
    }
}