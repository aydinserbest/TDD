        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        assertEquals(five, product); 

output: 
    java.lang.AssertionError: 
    Expected :example3.Dollar@1bc6a36e
    Actual   :example3.Dollar@1ff8b8f

In the example you provided, 
the statement assertEquals(five, product); results in an AssertionError 
because the equals method in the Dollar class is not properly overridden. 
Thus, Java's default equals method compares objects based on their references (memory addresses). 
In this case, since five and product are different objects with different memory addresses, 
this comparison returns false, and the test fails.
To resolve this issue, you need to override the equals method in the Dollar class as follows:

    public class Dollar {
    int amount;
    
        Dollar(int amount) {
            this.amount = amount;
        }
    
        Dollar times(int multiplier) {
            return new Dollar(amount * multiplier);
        }
    
        @Override
        public boolean equals(Object object) {
            if (object instanceof Dollar) {
                Dollar dollar = (Dollar) object;
                return this.amount == dollar.amount;
            }
            return false;
        }
    }

After adding this overridden equals method, 
you can use the statement assertEquals(five, product); 
between the five object and the product object obtained from five.times(2). 
However, it's important to note that the result from five.times(2) will not be equal to five 
because while five.amount is 5, the product.amount resulting from five.times(2) will be 10. 
Therefore, this test will still fail, but this time for a logical reason—they indeed should not be equal. 
If what you want to test is that twice the amount of the five object equals 10, 
the correct test would be assertEquals(new Dollar(10), product);


###

If you had not overridden the equals method in the Dollar class, 
the statement assertEquals(new Dollar(10), five.times(2)); 
would likely have resulted in an unexpected outcome or the test would have failed. 
This is because, in Java, if a class's equals method is not overridden, 
the default equals method from the Object class is used. 
This default method compares objects based on their references (memory addresses), 
checking if two objects are the exact same object.
When you do not override the equals method in the Dollar class, 
each new Dollar() invocation creates a new object in memory, and these objects
have different references. 
In such cases, the comparison between new Dollar(10) 
and another new Dollar(10) resulting from five.times(2), 
would return false because both objects do not share the same memory address. 
Therefore, the test fails.

For example:

    Dollar a = new Dollar(10);
    Dollar b = new Dollar(10);
    System.out.println(a.equals(b)); // When the default equals is used, it returns false.

This output would be false because a and b are located in different places in memory, 
hence the default equals considers them as different.

Therefore, overriding the equals method in the Dollar class is crucial 
for enabling comparisons based on the values of objects (in this case, the amount property). 
This ensures that test methods like assertEquals function correctly 
and allow for value-based equality checks.


