
    Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
    Bank bank = new Bank();
    Money result = bank.reduce(sum, "USD");
In this code, the sum variable is created as a reference of type Expression. 
However, it is actually instantiated using 
new Sum(Money.dollar(3), Money.dollar(4)). 
This is a common occurrence in Java and many other object-oriented programming languages and is one of the fundamental characteristics of polymorphism.

Relationship of Sum Class with the Expression Interface
Expression here is an interface, and the Sum class implements this interface. The declaration Expression sum indicates that the variable sum is of type Expression, but it is initialized with an object of type Sum. This means:

sum Variable: This variable holds a reference of type Expression but actually points to a Sum object.
Object Type: The object created is derived from the Sum class, hence the type of this object is Sum.
Working Principle of Polymorphism
Given that the sum variable points to an object derived from the Sum class, any method invoked on sum will execute the methods defined in the Sum class. For example:

If sum.reduce("USD") is called, it will invoke the reduce method from the Sum class because sum is actually a Sum object.
This mechanism is implemented in the Bank class's reduce method, where source.reduce(to); is executed. If the source passed is the sum variable, it triggers the reduce method of the Sum object. Thanks to polymorphism, a method call on a reference of type Expression will execute the methods of the actual class from which the object is derived. This feature is known in Java as "late binding" or "dynamic dispatch."

This architecture generally makes the code more modular and flexible because it allows method invocations on references of type Expression to execute methods from different derived classes. The system determines which object type to work with at runtime, not at compile time, enabling a much more dynamic structure. This approach reduces the need for type checking and casting, making the code cleaner and easier to maintain.