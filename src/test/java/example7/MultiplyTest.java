package example7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MultiplyTest {

    @Test
    public void testMultiplication() {
        Dollar fiveDollars = new Dollar(5);

        assertEquals(new Dollar(10), fiveDollars.times(2));
        assertEquals(new Dollar(15), fiveDollars.times(3));

        Franc fiveFrancs = new Franc(5);
        assertEquals(new Franc(10), fiveFrancs.times(2));
    }
}

