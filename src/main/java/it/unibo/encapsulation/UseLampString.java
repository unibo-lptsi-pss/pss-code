package it.unibo.encapsulation;
import java.io.IO;

public class UseLampString {
  	public static void main(String[] s) {
        LampString l = new LampString();
        l.switchOn();
        l.setIntensity(0.5);
        l.dim();
        l.dim();
        l.brighten();
        IO.println(l.toString());
        IO.println("Oppure : " + l);
    }
}
