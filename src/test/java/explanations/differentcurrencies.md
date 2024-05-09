test1:

        @Test
        public void testSimpleAddition2() {
        Money sum = Money.dollar(5).plus(Money.franc(5));
        System.out.println(sum.currency);
        assertEquals(Money.dollar(10), sum);
        }

In the scenario you mentioned, 
understanding how the plus method behaves 
and why the test passed with USD is critical 
by looking into the details of the Money.dollar(5).plus(Money.franc(5)) operation.

Here is the initial state of the Money class and the plus method:


    public Money plus(Money addend) {
    return new Money(amount + addend.amount, currency);
    }

This piece of code sums the amount of the addend object 
with the amount of the object it was called on 
and creates a new Money object using the currency of the object it was called on.

What Happens in Your Test Scenario?
In your test, you start with Money.dollar(5), which creates a Money object with the currency "USD". 
Then you add a Money object with the currency "CHF" using Money.franc(5). 
When you call the plus method, the following happens:

The plus method is called on the Money.dollar(5) object, which has the currency "USD".
The amount of the addend object Money.franc(5), which is 5, is 
added to the amount of Money.dollar(5), which is also 5.
A new Money object is created with the currency of Money.dollar(5), which is "USD". 
As a result, the currency of the result appears as "USD".
Why Is This Behavior Problematic?
This operation is quite misleading and incorrect for real currency transactions. 
Direct addition between different currencies cannot occur because each currency 
has a different value, and conversion rates are needed. 
However, the initial state of the plus method does not consider such conversions 
and merely sums the amounts, adopting the currency of the first Money object.

What Would Be the Correct Approach?
A correct approach requires a mechanism to manage the conversion of different currencies. 
For example, a Bank class could manage the conversions 
before performing any addition between different currencies. 
This prevents incorrect results and currency errors. 
As seen in your test, the current plus method can give misleading results 
when used in real scenarios, thus a safer and more accurate method needs to be developed 
for such transactions.

###


test2:

        @Test
        public void testSimpleAddition3() {
        Money sum = Money.franc(5).plus(Money.dollar(5));
        System.out.println(sum.currency);
        assertEquals(Money.dollar(10), sum);
        }

Observed Behavior
In your test Money.franc(5).plus(Money.dollar(5)):

The plus method is called on Money.franc(5), 
so the resulting Money object is created with the "CHF" currency.

The assertEquals(Money.dollar(10), sum) fails 
because the expected value is "10 USD", but the actual result is "10 CHF".

Origin of the Problem
The simple implementation of the plus method directly adds two different currencies 
without considering their actual exchange rates, 
applying the currency of the object it was called on to the result. 
This is unacceptable in real-world scenarios where different currencies have different values.

Steps Towards a Better Solution
Currency Conversion: 
In real-world applications, converting currencies using appropriate exchange rates is essential 
before performing operations between them. 
This task is typically managed by a Bank class.

Using the Bank Class: 
The Bank class can manage currency conversions and 
perform operations like addition using an Expression interface. For example:

    Bank bank = new Bank();
    bank.addRate("USD", "CHF", conversionRate);  // Define the conversion rate
    Money result = bank.reduce(sum, "USD");  // Convert CHF to USD
Writing Comprehensive Tests: 
To accurately test operations between different currencies, 
more detailed tests should be written. These tests should check the conversion rates and 
whether the Bank class is functioning correctly.
This situation illustrates the power of TDD in shaping code according to real needs. 
You start with a simple solution and evolve the code to address realistic and complex scenarios. 
This process ensures that the code becomes more robust and useful.






