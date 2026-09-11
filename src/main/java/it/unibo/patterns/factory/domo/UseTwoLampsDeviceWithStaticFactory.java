package it.unibo.patterns.factory.domo;
import java.io.IO;

public class UseTwoLampsDeviceWithStaticFactory {
	public static void main(String[] args) {
		TwoLampsDeviceWithStaticFactory td = new TwoLampsDeviceWithStaticFactory();
		td.switchOnBoth();
		IO.println(td);
		td.ecoMode();
		IO.println(td);
	}
}
