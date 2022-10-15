package it.unibo.patterns.factorymethod.domo;

public class AdvancedLampImpl implements AdvancedLamp {
   public final static int MIN_INTENSITY = 1;
   public final static int MAX_INTENSITY = 10;

   private int intensity;
   private boolean switchedOn;

   public AdvancedLampImpl() {
      this.switchedOn = false;
      this.intensity = MIN_INTENSITY;
   }

   public void switchOn() {
      this.switchedOn = true;
   }

   public void switchOff() {
      this.switchedOn = false;
   }

   public boolean isSwitchedOn() {
      return this.switchedOn;
   }

   public void setIntensity(final int i) {
      this.intensity = i > MAX_INTENSITY ? MAX_INTENSITY :
         (i < MIN_INTENSITY ? MIN_INTENSITY : i);
   }

   public void dim() {
      setIntensity(getIntensity() - 1);
   }

   public void brighten() {
      setIntensity(getIntensity() + 1);
   }

   public int getIntensity() {
      return this.intensity;
   }
   
   public String toString() {
	   return "LAMP[" + this.isSwitchedOn() + "; intensity: " + this.getIntensity() + "]";
   }

}
