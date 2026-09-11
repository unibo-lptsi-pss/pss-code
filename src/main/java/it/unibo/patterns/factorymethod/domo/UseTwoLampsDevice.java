package it.unibo.patterns.factorymethod.domo;
import java.io.IO;

public class UseTwoLampsDevice {
	private static void testWith(TwoLampsDevice td) {
		td.switchOnBoth();
		IO.println(td);
		td.ecoMode();
		IO.println(td);
	}

	public static void main(String[] args) {
		testWith(new TwoLampsDevice()); 
		testWith(new TwoAdvancedLampsDevice());
		testWith(new TwoMixedLampsDevice());
	}
}
