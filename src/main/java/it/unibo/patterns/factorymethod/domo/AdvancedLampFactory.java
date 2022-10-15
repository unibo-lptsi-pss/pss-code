package it.unibo.patterns.factorymethod.domo;

public class AdvancedLampFactory implements LampFactory {

    @Override
    public Lamp createLamp() {
        return new AdvancedLampImpl();
    }

}