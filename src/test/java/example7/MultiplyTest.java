package example7;

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

