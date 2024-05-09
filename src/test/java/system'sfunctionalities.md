multi-currency money

###

This system performs the following operations:

1-Queries whether the money is in a specified currency.
2-Multiplies a certain amount of money to create new amounts.
3-Checks whether two amounts of money are equal to each other.

###
the system's functions:

1-Query Currency
2-Multiply Amount
3-Check Equality

###

the functionality of the code with concrete examples:

Multiplication Calculation: 
Suppose a person has $5. This individual wants to triple their money. 
The system calculates that multiplying $5 by 3 results in a total of $15.

Currency Comparison: 
Two people want to check if they have the same amount of money. 
The first person has $10, while the second person has 10 Swiss Francs. 
The system compares these amounts and indicates that they are not equal 
because they are in different currencies.

Currency Query: 
A user wants to know the currency of the money they hold. 
When the user queries the system for an amount of $1, the system confirms that this amount is in dollars.

These examples illustrate how the code performs basic money operations and currency queries. 
Each operation can be easily executed through the classes and methods defined in the code.

###

here are three test examples written according to the code structure, 
each verifying different functionalities:

1. Multiplication Test
   This test verifies that the times method of the Money class correctly multiplies an amount 
by a specified factor.

        public class MoneyTest {
        @Test
        public void testMultiplication() {
        Money fiveDollars = Money.dollar(5);
        assertEquals(Money.dollar(15), fiveDollars.times(3));
        }
        }
2. Currency Mismatch Test
   This test ensures that the equals method of the Money class correctly identifies that 
monies in different currencies are not equal.


        public class MoneyTest {
        @Test
        public void testCurrencyMismatch() {
        Money tenDollars = Money.dollar(10);
        Money tenFrancs = Money.franc(10);
        assertFalse(tenDollars.equals(tenFrancs));
        }
        }
3. Currency Query Test
   This test confirms that the currency method of the Money object correctly returns the currency.

    
        public class MoneyTest {
        @Test
        public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
        }
        }
Each test checks whether a specific function of the system is performed correctly, 
thus ensuring the software behaves as expected. 
These tests are written using the JUnit testing framework and can be run in a Java development environment.