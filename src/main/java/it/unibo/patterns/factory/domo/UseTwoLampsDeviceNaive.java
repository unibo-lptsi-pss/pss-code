package it.unibo.patterns.factory.domo;
import java.io.IO;

public class UseTwoLampsDeviceNaive {
	public static void main(String[] args) {
		TwoLampsDeviceNaive td = new TwoLampsDeviceNaive();
		td.switchOnBoth();
		IO.println(td);
		td.ecoMode();
		IO.println(td);
	}
}
