package example3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MultiplyTest {
    @Test
    public void testMultiplication() {

        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        assertEquals(five, product);
        //assertEquals(new Dollar(5), new Dollar(5));
//        product = five.times(3);
//        assertEquals(15, product.amount);
    }
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}

