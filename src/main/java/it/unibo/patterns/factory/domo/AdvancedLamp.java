package it.unibo.patterns.factory.domo;

public interface AdvancedLamp extends Lamp {	
    public void dim();
    public void brighten();
    public void setIntensity(int level);
}
