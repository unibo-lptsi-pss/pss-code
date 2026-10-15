package it.unibo.polymorphism.abs;

public class UseLamps {
    static void main(String[] s) {
        LimitedLamp lamp = new CountdownLamp(5);
        for (int i = 0; i < 4; i++) {
            lamp.switchOn();
            lamp.switchOff();
        }
        IO.println("cl| " + lamp);
        lamp.switchOn();
        IO.println("cl| " + lamp); // al quinto switch si esaurisce

        LimitedLamp lampExp = new ExpirationTimeLamp(1000); // 1 sec
        lampExp.switchOn();
        IO.println("lampExp| " + lampExp);
        waitFor(3000); // attendo 1.1 secs
        IO.println("lampExp| " + lampExp); // dopo 1.1 secs si è esaurita
        lampExp.switchOff();
        lampExp.switchOn();
        IO.println("lampExp| " + lampExp);
    }

    /* !!! WE WILL SEE THE RIGHT METHOD TO WAIT; DO NOT USE IN YOUR PROJECT !! */
    private static void waitFor(final long time) {
        final long end = System.currentTimeMillis() + time;
        while(System.currentTimeMillis() < end);
    }
}
