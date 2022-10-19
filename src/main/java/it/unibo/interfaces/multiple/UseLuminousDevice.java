package it.unibo.interfaces.multiple;

public class UseLuminousDevice {
    public static void main(String[] s) {
    	// Creo un DomusController
    	final LuminousDevice ld = new Lamp();
		System.out.println(ld.toString());
		ld.switchOn();
		System.out.println(ld.toString());
		ld.brighten();
		System.out.println(ld.toString());
	}
}
