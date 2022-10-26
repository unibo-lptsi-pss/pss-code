package it.unibo.patterns.factorymethod.domo;

public class TwoLampsDevice {
	private Lamp l1;
	private Lamp l2;

	public TwoLampsDevice() {
		this.l1 = createLamp();
		this.l2 = createLamp();
	}

	public Lamp createLamp() {
		return new SimpleLampImpl();
	}

	public void switchOnBoth() {
		this.l1.switchOn();
		this.l2.switchOn();
	}

	public void switchOffBoth() {
		this.l1.switchOff();
		this.l2.switchOff();
	}

	public void ecoMode() {
		this.l1.ecoMode();
		this.l2.ecoMode();
	}

	public String toString() {
		return "{" + l1 + "; " + l2 + "}";
	}
}
