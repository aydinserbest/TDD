Compare Francs with Dollars 

what happens when we compare Francs with Dollars?


Money Class Functionality:
The Money class defines the fundamental properties and behaviors of currencies.
The derived classes, Franc and Dollar, are specialized for different currencies.
In the code, the equals method within the Money class checks if two Money objects are equal.
If both objects have the same amount of money, this method returns true.
However, there's a problem:
although the Franc and Dollar classes represent different currencies,
the equals method only checks the amount.
As a result, 5 Francs are considered equal to 5 Dollars.
This is not appropriate for real-world scenarios
because direct equality between different currencies should not exist.
Solution to the Problem:
To address this issue, the equals method in the Money class
has been updated to check not only the amounts but also the classes (i.e., the currencies) of the objects:

            public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
    }

This code checks both the amount and the type of the objects.
Thus, comparisons between different classes (such as Franc and Dollar) correctly return false.
Even if they have the same amounts, objects representing different currencies, like Francs and Dollars,
are no longer considered equal.
Example Test Case:

        public void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));  // Tests whether 5 Dollars is equal to 5 Dollars, result is true.
    assertFalse(new Dollar(5).equals(new Dollar(6))); // Tests whether 5 Dollars is equal to 6 Dollars, result is false.
    assertTrue(new Franc(5).equals(new Franc(5)));    // Tests whether 5 Francs is equal to 5 Francs, result is true.
    assertFalse(new Franc(5).equals(new Franc(6)));   // Tests whether 5 Francs is equal to 6 Francs, result is false.
    assertFalse(new Franc(5).equals(new Dollar(5)));  // Tests whether 5 Francs is equal to 5 Dollars, result is false.
    }

These tests verify that the new equals method works correctly.
It does not allow equality between different currencies,
but it does allow equality between the same currency and amount.
This shows that the code meets the requirements correctly.
Functionality of the Existing Equals Method Regarding the Same Amount Representing Different Currencies:
Initially, the equals method only checked the amount (amount).
For example, 5 Francs and 5 Dollars were considered equal
because the method did not check the type of currency.
Therefore, even for different currencies like Franc and Dollar,
if the amounts were the same, they were considered equal.

Author's Statement "It fails. Dollars are Francs.":
The author's statement "It fails" is used to emphasize that
the test was unsuccessful and the existing equals method's design was flawed.
In fact, the test cases provided in the code block might have been written by the author
after introducing the new equals' method.
Because the new method also checks the type of currency,
"assertFalse(new Franc(5).equals(new Dollar(5)));" successfully returns false,
meaning the test passes. However, the author is highlighting the inadequacy of the old equals method
and the "failure" that results from this inadequacy.
In essence, the author's "it fails" statement is used to underline why the old method needed to be changed.
This emphasis is made to highlight the need for revising the code.

"Failure" Statement:
The "failure" statement indicates that the tests technically passed,
meaning they did not produce an error,
but they did not produce the correct logical results.
Thus, the program may run without error, but it does not produce correct logical outcomes.
This condition demonstrates that while the equals method technically works
and does not produce errors (i.e., the program does not crash or give error messages),
it incorrectly evaluates different currencies like Franc and Dollar as equal if their amounts are the same. In the real world, however, different currencies, even if they have the same amounts, should not be considered equal. Therefore, the author criticizes this situation with the "it fails" statement and indicates that the method needs to be updated.
This type of situation is a typical part of the test-driven development (TDD) process:
code is written first, followed by writing tests to find and correct possible errors.
In this process, initially passing
but incorrectly resulting tests are seen as an opportunity
to further improve the code.





