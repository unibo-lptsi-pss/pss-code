package it.unibo.patterns.factory.domo;

public class UseTwoLampsDeviceNaive {
	public static void main(String[] args) {
		TwoLampsDeviceNaive td = new TwoLampsDeviceNaive();
		td.switchOnBoth();
		System.out.println(td);
		td.ecoMode();
		System.out.println(td);
	}
}
