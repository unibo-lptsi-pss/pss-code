package it.unibo.patterns.factorymethod.domo;

public class TwoMixedLampsDevice extends TwoLampsDevice {
	int i=0;
	@Override
	public Lamp createLamp() {
		return i++ % 2 == 0 ? new SimpleLampImpl() : new AdvancedLampImpl();
	}
}
