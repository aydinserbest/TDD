package example2;

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
    TDD is not about taking teeny-tiny steps, it’s about being able to take teeny-tiny steps.
    Steve Freeman pointed out that the problem with the test and code as it sits is not duplication
    The problem is the dependency between the code and the test—
    you can’t change one without changing the other.

    following these two simple rules can lead us to work much more closely to our potential.
    • Write a failing automated test before you write any code.
    • Remove duplication.

    That’s why the second rule appears in TDD.
    By eliminating duplication before we go on to the next test,
    we maximize our chance of being able to get the next test running with one and only one change.

    eliminate duplication before moving on.

    1.Quickly add a test.
    2. Run all tests and see the new one fail.
    3. Make a little change.
    4. Run all tests and see them all succeed.
    5. Refactor to remove duplication.

    getting rid of duplication between the test code and the working code.

     */
    /*
    Dependency is the key problem in software development at all scales.
    If dependency is the problem, duplication is the symptom.
    Duplication most often takes the form of duplicate logic—the same expression appearing
    in multiple places in the code.
    Objects are excellent for abstracting away the duplication of logic.


     */