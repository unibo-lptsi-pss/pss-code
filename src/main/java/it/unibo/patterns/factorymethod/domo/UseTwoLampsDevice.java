package it.unibo.patterns.factorymethod.domo;

public class UseTwoLampsDevice {

	public static void main(String[] args) {
		LampFactory lf = new AdvancedLampFactory();
		TwoLampsDevice td = new TwoLampsDevice(lf);
		System.out.println(td);
		td.ecoMode();
		System.out.println(td);
	}

}
