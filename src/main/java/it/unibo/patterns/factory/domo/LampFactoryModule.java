package it.unibo.patterns.factory.domo;

public class LampFactoryModule {
    public static Lamp createLamp(boolean advanced) {
        return advanced ? new AdvancedLampImpl() : new SimpleLampImpl();
    }
}
