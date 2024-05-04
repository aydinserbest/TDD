package example8;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void testMultiplication() {
        Dollar fiveDollars = new Dollar(5);

        assertEquals(new Dollar(10), new Dollar(10));
        assertEquals(new Franc(15), new Franc(15));

        assertNotEquals(new Franc(10), new Dollar(10));
    }
}
    /*
    this piece of code is used not only to check the amounts
    but also whether the currency types (for instance, both being Dollar or both being Franc) are the same.
    If the two objects belong to the same class,
    this expression returns true; otherwise, it returns false.
     */

