package example7;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void testMultiplication() {
        Dollar fiveDollars = new Dollar(5);

        assertEquals(new Dollar(10), fiveDollars.times(2));
        assertEquals(new Dollar(15), fiveDollars.times(3));

        Franc fiveFrancs = new Franc(5);
        assertEquals(new Franc(10), fiveFrancs.times(2));
    }
    @Test
    public void testEquality() {
        assertTrue(new Dollar(10).equals(new Dollar(10)));
        assertEquals(new Dollar(10), new Dollar(10));

        assertFalse(new Dollar(15).equals(new Dollar(10)));
        assertNotEquals(new Dollar(15), new Dollar(10));

        assertTrue(new Franc(10).equals(new Franc(10)));
        assertEquals(new Franc(10), new Franc(10));

        assertFalse(new Franc(5).equals(new Franc(10)));
        assertNotEquals(new Franc(5), new Franc(10));

    }
}

