package it.unibo.tdd;

import org.junit.jupiter.api.*;

public class TvTestRed {
    TvRed tv;

    @BeforeEach
    public void setUp(){ tv = new TvRed(); }

    @Test
    public void testTurnOnFromOff() {
        Assumptions.assumeTrue(!tv.isOn()); // assunzione: il test ha senso solo se tv è spento
        tv.turnOn();
        Assertions.assertTrue(tv.isOn());
    }
}