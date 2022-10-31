package it.unibo.inheritance.extendible;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCounters {
    @Test
    void testCounter() {
        LimitCounter lc = new LimitCounter(3);
        for(int i=0; i<10; i++) {
            lc.increment();
        }
        Assertions.assertEquals(3, lc.getValue());
    }
}
