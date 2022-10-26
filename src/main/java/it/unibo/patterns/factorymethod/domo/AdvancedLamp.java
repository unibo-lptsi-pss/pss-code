package it.unibo.patterns.factorymethod.domo;

public interface AdvancedLamp extends Lamp {	
    public void dim();
    public void brighten();
    public void setIntensity(int level);
}
