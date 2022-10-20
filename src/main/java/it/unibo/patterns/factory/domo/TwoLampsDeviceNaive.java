package it.unibo.patterns.factory.domo;

public class TwoLampsDeviceNaive {
	private Lamp l1;
	private Lamp l2;

	public TwoLampsDeviceNaive() {
		this.l1 = new SimpleLampImpl();
		this.l2 = new AdvancedLampImpl();
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
