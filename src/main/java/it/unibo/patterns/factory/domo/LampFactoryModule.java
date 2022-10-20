package it.unibo.patterns.factory.domo;

public class LampFactoryModule {
    public static Lamp createLamp(boolean advanced) {
        return advanced ? createAdvancedLamp() : createSimpleLamp();
    }
    public static AdvancedLamp createAdvancedLamp() {
        return new AdvancedLampImpl();
    }
    public static Lamp createSimpleLamp() {
        return new SimpleLampImpl();
    }
}
