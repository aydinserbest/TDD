The use of the assertEquals method relies on Java's equals method to test the equality of two objects. 
Therefore, when you override the equals method in the Dollar class, 
the behavior of the assertEquals method also changes.
Initially, the statement assertEquals(10, product.amount); 
directly compared the value of product.amount with a number. 
This did not check the equality of Dollar objects; it only looked at internal values (amount).

With the second version, assertEquals(new Dollar(10), product);, 
the comparison is now between Dollar objects. Here, the assertEquals method 
uses the overridden equals method of the Dollar class to check if the product object 
and the newly created new Dollar(10) are equal. 
At this point, the equality rules defined in your Dollar class's equals method come into play.

The third version, assertEquals(new Dollar(10), five.times(2));, 
takes this comparison further by combining the call and the result of the times method 
into a single statement. This makes the test cleaner and more readable and continues 
to use the equality check for Dollar objects.

Thus, the use of the assertEquals method remains unchanged; 
however, depending on how you define the equals method in the Dollar class, 
the type of equality check performed when assertEquals is used will vary. 
Therefore, carefully defining the equals method in the Dollar class is very important 
to ensure your tests yield correct results.