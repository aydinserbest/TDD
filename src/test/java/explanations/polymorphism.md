In this scenario, the concept of polymorphism comes into play, complicating matters somewhat, but this complexity also increases the system's flexibility and extensibility. Let me explain step-by-step:

Polymorphism and the reduce Method
The expression in the Bank class’s reduce method is:


    Money reduce(Expression source, String to) {
    return source.reduce(to);
    }
This method takes a source object of type Expression and calls its reduce(String to) method. The important aspect here is which class the source object belongs to. Since Expression is an interface, this method can call the reduce method of any class that implements this interface.

Sum Class's reduce Method
In your example, the object passed as source is a Sum object created with new Sum(Money.dollar(3), Money.dollar(4)). In this case, the reduce method of the Sum class will be executed. Since the Sum class implements the Expression interface, it must implement the reduce method defined in this interface in a way that is specific to its class. The reduce method in the Sum class might look like this:


    public Money reduce(String to) {
    int totalAmount = augend.amount + addend.amount;
    return new Money(totalAmount, to);
    }
This method sums the amounts of the Money objects stored in the augend and addend fields of the Sum object and creates a new Money object in the desired currency.

How Polymorphism Works
Thanks to polymorphism, when you call the reduce method of the Bank class, it executes the reduce method of the object provided as source (in this example, a Sum object). If a different Expression object had been provided as the source (for example, another derived class), then that object's reduce method would have been executed.

This structure allows the code to be more general and flexible. You can use the same reduce method call for different Expression derivatives, and each derived class can perform the reduce method according to its internal workings. This prevents code duplication and creates a system that is more open to changes.