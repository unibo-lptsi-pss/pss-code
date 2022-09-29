package it.unibo.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OnAssertions {
    @Test
    public void workingWithAssertions(){
        assertFalse("hello" == new String("hello"));
        assertEquals("hello", new String("hello"));
        assertNotSame("hello", new String("hello"));

        assertTrue(new int[] { 1, 2, 3 } != new int[] { 1, 2, 3 });
        assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });

        Object o = null;
        assertThrows(NullPointerException.class, () -> o.toString());

        assertNull(o);
        assertNotNull(new int[]{ });
        assertSame(o, o);
    }
}
