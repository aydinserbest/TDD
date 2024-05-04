package example10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MultiplyTest {

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(10), Money.dollar(10));
        assertEquals(Money.dollar(15), Money.dollar(15));
    }

    @Test
    public void testDifferentClassEquality() {
        assertTrue(new Money(10, "USD").equals(new Franc(10, "CHF")));

    }
}
