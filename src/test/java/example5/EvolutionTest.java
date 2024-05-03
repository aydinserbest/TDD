package example5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EvolutionTest {

    /*
    the expressiveness of the test is low;
    it only validates numerical values and
    it's not clear how the times method affects the object.
    Moreover, it's difficult to follow each step of the operation chain
    that the test wants to validate,
    making it hard to understand what the test is checking.
     */
    /*
    This test misuses the times method of the Dollar class.
    The method modifies the object's own amount value,
    which causes the second assertEquals call to produce an incorrect result (30).
    Since the five object is multiplied twice, the expected value turns out to be 30 instead of 15.
    This approach does not clearly convey what the test is checking and could be misleading.
     */
    @Test
    public void test1() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
        five.times(3);
        assertEquals(15, five.amount);
    }

    /*
    The times method now returns a new Dollar object and does not modify the original object.
    This shows that the method is side-effect free, which is generally a cleaner programming practice.
    The tests are still based on numerical values. assertEquals still checks the amount property,
    so it's not fully in line with object encapsulation.
    numerical comparison is still being done using product.amount.
    While this test is more understandable, directly comparing the values of Dollar objects
    would have been better.
     */

    @Test
    public void test2() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }


    /*
    The tests are now based on objects.still relies on amount values for testing.
    This means it's not fully appropriate for encapsulation and object-oriented approach.

    At this stage, the equals method has been added,
    yet product.amount is still being used.
    The addition of the testEquality test now ensures the equality check for Dollar objects.
    However, for the testMultiplication to be "speaking," it needs to perform comparisons
    based on object instances.
     */
    @Test
    public void test3() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);

        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }

    /*
    This final version very clearly expresses the intent and meaning of the tests.
    We are now directly checking the equality of Dollar objects,
    which correctly reflects the use of the equals method and object encapsulation.
    The tests explicitly state the expected results (new Dollar(10) and new Dollar(15))
    and validate the functionality of the Dollar class directly through objects.
    This makes the tests "speaking" because it clearly communicates to the reader
    what the test is checking and what the expected outcomes are.
     */
    @Test
    public void test4() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    /////////
    /*
    the tests have become much more "speaking."
    The tests use direct comparison of Dollar objects to clearly
    and explicitly express the expected outcome of the times method.
    This best communicates to the person reading the code what is being tested
    and what the expected outcomes are.
     */
}

    /*
    In conclusion, each evolutionary stage represents a step towards
    making the tests more explanatory and understandable.
   This, in turn, enhances the readability and maintainability of the test code.
     */