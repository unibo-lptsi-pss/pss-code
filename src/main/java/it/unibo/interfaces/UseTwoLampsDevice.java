package it.unibo.interfaces;
import java.io.IO;

public class UseTwoLampsDevice {

	public static void main(String[] args) {
		TwoLampsDevice td = new TwoLampsDevice();
		IO.println(td);
		td.ecoMode();
		IO.println(td);
		td.getSecond().brighten();
		IO.println(td);
	}

}
