package example1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void testMultiplication() {
        Dollar five= new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount); }
}

    /*
    You probably aren’t going to like the solution,
    but the goal right now is not to get the perfect answer but to pass the test.
    We’ll make our sacrifice at the altar of truth and beauty later.
    Here’s the smallest change I could imagine that would cause our test to pass:
        Dollar
        int amount= 10;
     */