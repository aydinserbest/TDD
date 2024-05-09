    Money plus(Money addend) {
    return new Money(amount + addend.amount, currency);
}

Basic Method Behavior
This method directly sums the amounts without any currency control, 
and uses the currency of the object it was called on to create a new Money object. 

Thus, if Money objects of two different currencies are attempted to be added together using this method, 
it would not produce the correct result. 
For example, in the operation Money.dollar(5).plus(Money.franc(5)), 
this method could produce an incorrect result because two different currencies are directly added together, 
which is not suitable for real-world scenarios.