package example3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
        /*
        After the first call to times(),
        five isn’t five anymore, it’s really ten.
        If, however, we return a new object from times(),
        then we can multiply our original five bucks all day and never have it change.
        We are changing the interface of Dollar when we make this change,
        so we have to change the test.

         */
        five.times(3);
        assertEquals(15, five.amount);
    }
    /*
    a significant issue with the current design of the Dollar class's times method.
    The method directly modifies the amount value,
    making the Dollar object state persistently change with each multiplication.
    For example, after calling five.times(2), the object's amount becomes 10.
    This change indicates that the object isn't consistent after each call.
    The author suggests solving this by having the times method return a new Dollar object,
    preventing the amount value from changing permanently after each multiplication.
    The test fails because the times method directly modifies the amount value
    instead of returning a new Dollar object.
    This causes the amount to increase permanently with each call.
    For instance, calling five.times(2)
    changes amount to 10, and calling five.times(3) changes it to 30,
    conflicting with the expected 15 in the test.
    This, however, changes the interface of the Dollar class, requiring us to revise the test.
     */
    @Test
    public void testMultiplicationCorrect() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product= five.times(3);
        assertEquals(15, product.amount);



    }
}

