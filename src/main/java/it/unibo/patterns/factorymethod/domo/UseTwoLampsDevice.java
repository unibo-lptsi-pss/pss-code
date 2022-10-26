package it.unibo.patterns.factorymethod.domo;

public class UseTwoLampsDevice {
	private static void testWith(TwoLampsDevice td) {
		td.switchOnBoth();
		System.out.println(td);
		td.ecoMode();
		System.out.println(td);
	}

	public static void main(String[] args) {
		testWith(new TwoLampsDevice()); 
		testWith(new TwoAdvancedLampsDevice());
		testWith(new TwoMixedLampsDevice());
	}
}
