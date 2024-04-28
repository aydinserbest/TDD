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
    1-The test's failure should be considered progress in the development process.
    Test failed; the expected result was '10' instead of '0'.
    Failure is considered progress; we now have a clear measure of failure.
    This situation transforms the problem from 'provide multi-currency support'
    to
    'make this test and the subsequent tests work'.
     */
    /*
    2-Observing the test failure;
    the test gives a result of "0" instead of the expected "10".
    This failure is considered a clear progression in the development process
    because there is now a concrete measure of failure,
    which is much better than failing in an unclear manner.
    The programming problem has now shifted from a complex "provide multi-currency support" requirement
    to focusing on making this test and then the subsequent tests work
    because there is a concrete indicator of the problem.
    This facilitates focusing on more specific and manageable objectives.
    The failure, by clearly showing what the problem is, is considered a progression.
    This concrete failure clarifies the issue, providing a more focused roadmap for the solution.
    The phrase "we now have a concrete measure of failure"
    refers to the tangible demonstration of the test results.
    That is, the test showing an output of "0" instead of the expected "10".
    The testing framework, JUnit, displays this result with a red bar (fail bar),
    providing a direct and clear indication of why and how the code failed.
    This helps developers pinpoint exactly where and how to fix the problem.
     */
    /*
    3-The primary goal here is not to achieve a perfect solution
    but rather to write code that will pass the tests initially.
    As the author states, the primary goal is to pass the test,
    with perfection addressed later.
    In this process, a failing test is written before any code,
    providing a clear roadmap for the correct development of the code.
    The failure of the test, by clearly exposing the problem, helps developers
    tackle the issue in a more focused and manageable way.
    Consequently, this approach transforms complex problems into simpler,
    more manageable goals, improving the software development process.
     */
    /*
    4-The failure of the test is considered part of the Test-Driven Development (TDD) process.
    The first step in the TDD approach is to write a failing test before any code is written.
    This test is expected to fail because the code to pass the test has not yet been written.
    The failure of the test clearly identifies the problem
    and provides developers with a concrete path to develop the code in the right direction.
    This transforms a complex "provide multi-currency support" requirement
    into more manageable, specific test targets, facilitating step-by-step development of the code.
    In this process, the goal is to first write the code to pass the test and then improve the code,
    rather than finding a perfect solution immediately.
     */