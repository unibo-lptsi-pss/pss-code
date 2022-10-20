package it.unibo.patterns.factory.domo;

public class UseTwoLampsDeviceWithStaticFactory {
	public static void main(String[] args) {
		TwoLampsDeviceWithStaticFactory td = new TwoLampsDeviceWithStaticFactory();
		td.switchOnBoth();
		System.out.println(td);
		td.ecoMode();
		System.out.println(td);
	}
}
