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

        assertTrue(new Dollar(10).equals(new Franc(10)));
        assertEquals(new Franc(10), new Dollar(10));
        //equals method needs to be updated according to the logic

        assertFalse(new Franc(5).equals(new Franc(10)));
        assertNotEquals(new Franc(5), new Franc(10));
    }
}
    /*
    the tests technically passed, meaning they did not produce an error,
    but they did not produce the correct logical results.
    Thus, the program may run without error, but it does not produce correct logical outcomes
     */

    /*
    it incorrectly evaluates different currencies like Franc and Dollar as equal
    if their amounts are the same.
    In the real world,
    however, different currencies, even if they have the same amounts, should not be considered equal
     */

