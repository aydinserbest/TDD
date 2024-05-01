package example3;

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
    /*
    1) Dollar dollar = (Dollar) object;
    (Dollar) object:
    This is a type conversion (casting).
    The equals() method is defined to take an Object object as its parameter,
    which means it can accept objects of any class.
    However, since we're overriding the equals() method for the Dollar class,
    we assume that the object parameter is actually a Dollar object.
    To make this conversion explicit and allow us to access its amount field, we cast it to Dollar using (Dollar).

    Dollar dollar:
    This declares a new variable dollar of type Dollar.
    The casted Dollar object from the object parameter is then assigned to this variable.
    This way, the Dollar object is stored in the dollar variable.

    2) amount == dollar.amount;

    The first amount:
    This refers to the amount field of the Dollar instance calling the equals() method.
    Even though it is not explicitly written as this.amount,
    the Java compiler understands it refers to the field of the calling Dollar instance.
    dollar.amount: This refers to the amount field of the Dollar object casted and assigned to the dollar variable earlier.

    3) return amount == dollar.amount;

    What is returned?:
    This line compares whether the amount fields are equal and returns a boolean value, either true or false.
    This return statement ensures that a boolean value is returned from the equals() method,
    indicating whether the amount fields of the two Dollar objects are equal.
    In this way, the equals() method checks the equality of two Dollar objects based on their amount fields,
    making it a value-based comparison for the class.
         */