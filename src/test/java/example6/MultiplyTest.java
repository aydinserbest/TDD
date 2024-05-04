package example6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MultiplyTest {
    @Test
    public void testMultiplicationOldVersion() {

        Dollar five = new Dollar(5);
        Dollar product= five.times(2);
        assertEquals(10, product.amount);
        product= five.times(3);
        assertEquals(15, product.amount);
    }
    @Test
    public void testMultiplicationUpdated() {
        //We can rewrite the assertions to compare Dollars to Dollars:
        //Now the temporary variable product isn’t helping much, so we can inline it:


        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

}

