package it.unibo.tdd;

import org.junit.jupiter.api.*;

public class TvTestGreen {
    Tv tv;

    @BeforeEach
    public void setUp(){ tv = new Tv(); }

    @Test
    public void testTurnOnWhenOff() {
        Assumptions.assumeTrue(!tv.isOn()); // assunzione: il test ha senso solo se tv è spento
        tv.turnOn();
        Assertions.assertTrue(tv.isOn());
    }

    @Test
    public void testTurnOffWhenOn() {
        tv.turnOn();
        Assumptions.assumeTrue(tv.isOn()); // assunzione: il test ha senso solo se tv è spento
        tv.turnOff();
        Assertions.assertFalse(tv.isOn());
    }
}