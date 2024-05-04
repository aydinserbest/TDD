reducing direct references to subclasses using the factory method approach:

Reducing Direct References
The term "direct references" refers to the code's direct linkage
to a specific class, such as Dollar or Franc subclasses in this example.
This linkage means the code becomes dependent on the structural details and existence of these classes.
Direct references to reduce the flexibility of the code
because any changes in the structure of these subclasses could directly affect the entire system.
If you want to change the class structure in the system or add a new class,
you would need to update all the code that has direct references to these classes.

Reducing Direct References with a Factory Method
The Money.dollar() factory method encapsulates the details of how instances of the Dollar class are created.
This method keeps the creation process of Dollar objects within the Money class
and abstracts it from the outside world.
Thus, you can work with objects of type Money without needing to know
how the Dollar class operates or how it is constructed.

Implementation in Test Code
First, let's look at how the code would be written without using a factory method:


    public void testMultiplication() {
    Dollar five = new Dollar(5); // Direct dependency on the Dollar class
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
    }
This code snippet is directly dependent on the Dollar class.
If the Dollar class changes, this test code would also be affected.
For instance, if a parameter is added to the constructor of the Dollar class,
you would need to update this test function.

Now, let's see how the code changes with the use of a factory method:

    public void testMultiplication() {
    Money five = Money.dollar(5); // Access via the Money class, details of the Dollar class are hidden
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
    }
In this new approach, using Money.dollar() hides the details of the properties and the creation process of the Dollar class. This ensures that changes in the Dollar class do not affect this test code. The test operates on the Money type and is not bound to the internal structure of the Dollar class. Thus, if there are structural changes in the Dollar class, there is no need to modify the test code.
This situation contributes to making the code more modular and sustainable.