package it.unibo.patterns.factory.domo;

public class TwoLampsDeviceWithStaticFactory {
	private Lamp l1;
	private Lamp l2;

	public TwoLampsDeviceWithStaticFactory() {
		this.l1 = LampFactoryModule.createLamp(false);
		this.l2 = LampFactoryModule.createLamp(true);
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
