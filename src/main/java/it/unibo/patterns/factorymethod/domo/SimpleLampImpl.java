package it.unibo.patterns.factorymethod.domo;

public class SimpleLampImpl implements Lamp {
   private boolean switchedOn;

   public SimpleLampImpl() {
      this.switchedOn = false;
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

   public String toString() {
	   return "LAMP[" + this.isSwitchedOn() + "]";
   }
}
