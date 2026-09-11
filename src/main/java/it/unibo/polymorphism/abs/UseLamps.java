package it.unibo.polymorphism.abs;
import java.io.IO;

public class UseLamps {
    // clausola throws Exception qui sotto necessaria!!
    public static void main(String[] s) throws Exception {
        LimitedLamp lamp = new UnlimitedLamp();
        lamp.switchOn();
        IO.println("ul| " + lamp);
        for (int i = 0; i < 1000; i++) {
            lamp.switchOff();
            lamp.switchOn();
        }
        IO.println("ul| " + lamp); // non si è esaurita

        lamp = new CountdownLamp(5);
        for (int i = 0; i < 4; i++) {
            lamp.switchOn();
            lamp.switchOff();
        }
        IO.println("cl| " + lamp);
        lamp.switchOn();
        IO.println("cl| " + lamp); // al quinto switch si esaurisce

        lamp = new ExpirationTimeLamp(1000); // 1 sec
        lamp.switchOn();
        IO.println("el| " + lamp);
        Thread.sleep(3000); // attendo 1.1 secs
        IO.println("el| " + lamp); // dopo 1.1 secs si è esaurita
        lamp.switchOff();
        lamp.switchOn();
        IO.println("el| " + lamp);
    }
}
