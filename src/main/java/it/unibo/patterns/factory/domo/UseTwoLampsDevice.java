package it.unibo.patterns.factory.domo;
import java.io.IO;

public class UseTwoLampsDevice {
	private static void testWith(LampFactory lf) {
		TwoLampsDevice td = new TwoLampsDevice(lf);
		td.switchOnBoth();
		IO.println(td);
		td.ecoMode();
		IO.println(td);
	}

	public static void main(String[] args) {
		testWith(new SimpleLampFactory()); 
		testWith(new AdvancedLampFactory());
	}
}
