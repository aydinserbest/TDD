The "Obvious" Solution
The "obvious" solution referred to by the author is 
the implementation of the plus method that directly sums the amounts of two Money objects 
and returns a new Money object. 

Here is this solution:
Obvious Solution:
The straightforward and logical solution found by the author is 
for the plus method to sum two amounts and create a new Money object in the same currency:

    Money plus(Money addend) {
    return new Money(amount + addend.amount, currency);
    }
This method sums the added amount (addend.amount) 
            with the current amount (amount) 
            and creates a new Money object in the same currency (currency). 

This solution directly and clearly fulfills the expected functionality of the method.

If It Were Not "Obvious":
If the solution were not so clear, 
the author might have considered using some sort of temporary solution (fake implementation) initially. 
This would have been a method to temporarily pass the test. For example:

    Money plus(Money addend) {
    return Money.dollar(10);  // Temporary solution, always returns 10 USD
    }
Such a temporary solution could be useful in cases where the method's structure is more complex or uncertain. 
It could help pass the test initially and verify the structure of the method. 
Later, as the real functionality is detailed, 
this temporary solution would be replaced with the real plus method implementation as described above.
The difference between these two approaches is related to a frequent situation in the TDD process, 
which involves writing "just enough code that is really necessary." 
Because the author indicated that the solution was obvious, 
he prefers a realistic and functional solution directly 
and finds it unnecessary to waste time with a temporary solution.