package it.unibo.patterns.factorymethod.domo;

public class TwoAdvancedLampsDevice extends TwoLampsDevice {
	@Override
	public Lamp createLamp() {
		return new AdvancedLampImpl();
	}
}
