package example10;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    //But we want references to Dollars to disappear,
    // so we need to change the declaration in the test:
    // We can now use our factory method everywhere in the tests:

    @Test
    public void testFactoryMethod() {
        Money five = Money.dollar(5);
        //No client code knows that there is a subclass called Dollar.
        //tests are independent of the existence of subclasses
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
}
