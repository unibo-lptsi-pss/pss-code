package it.unibo.patterns.factory.domo;

public class UseTwoLampsDevice {
	private static void testWith(LampFactory lf) {
		TwoLampsDevice td = new TwoLampsDevice(lf);
		td.switchOnBoth();
		System.out.println(td);
		td.ecoMode();
		System.out.println(td);
	}

	public static void main(String[] args) {
		testWith(new SimpleLampFactory()); 
		testWith(new AdvancedLampFactory());
	}
}
