package it.unibo.interfaces.multiple;
import java.io.IO;

public class UseLuminousDevice {
    public static void main(String[] s) {
    	// Creo un DomusController
    	final LuminousDevice ld = new Lamp();
		IO.println(ld.toString());
		ld.switchOn();
		IO.println(ld.toString());
		ld.brighten();
		IO.println(ld.toString());
	}
}
