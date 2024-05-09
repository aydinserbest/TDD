package example11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    /*
    1. Quickly add a test.
    2. Run all tests and see the new one fail.
     */
    /*
    Multiply Amount function:
    there is not Dollar class and methods and variables
    we only wrote test
     */

    @Test
    public void multiply(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}
