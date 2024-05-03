
However, the testMultiplication is still testing based on the amount values,
which does not fully comply with the principles of encapsulation and object-oriented approaches. 
Encapsulation, in object-oriented programming, is 
a principle that protects the internal data (state) and the methods (behavior) 
that access this data by hiding them from the external world and making them accessible 
only through specified interfaces. This principle prevents direct modification of data structures, 
thus making the software safer and easier to manage.

Violation of Encapsulation and Object-Oriented Approach
Example Code (Phase 3):

        public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
    }
    
    public class MultiplyTest {
    @Test
    public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
    }
    }
n this example, 
direct access to the Dollar class's amount field contravenes the principle of encapsulation. 
Whether the amount field is public or package-private (with no access modifiers used), 
it allows for direct external access to this field. 
Ideally, the amount field should be private and accessible only through methods controlled 
by the Dollar class.

Object-Oriented and Encapsulation-Compliant Approach
Recommended Code (Phase 4):

    public class Dollar {
    private int amount;  // The amount field is now private, meaning it cannot be accessed directly from outside.

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Dollar)) {
            return false;
        }
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }
    }
    

    public class MultiplyTest {
    @Test
    public void testMultiplication() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
    }
    }
In this code, the amount field is defined as private, 
so it can only be accessed through the methods of the Dollar class. 
In the tests, the statements assertEquals(new Dollar(10), five.times(2)); 
and assertEquals(new Dollar(15), five.times(3)); are used, 
allowing the values of Dollar objects to be evaluated based on object equality 
rather than direct numerical comparison. This approach preserves encapsulation 
and fully leverages the benefits of object-oriented programming.

In conclusion, encapsulation and an object-oriented approach protect the data 
and functionality from external interference and ensure the internal structure of the class is secure. 
Writing tests in this manner not only facilitates the maintenance of the software 
but also provides a more robust and reliable software development practice.







