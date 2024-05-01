In Java, every class inherits from the Object class, which includes an equals() method. 
However, by default, this method compares the references (i.e., memory addresses) of two objects. This means that:
If you do not override the equals() method in your class, comparing two Dollar instances with equals() 
will look at their addresses assigned by Java's memory management system, not their content.

    Dollar dollar1 = new Dollar(5);
    Dollar dollar2 = new Dollar(5);
    
    boolean isEqual = dollar1.equals(dollar2);


In this example, the value of the isEqual variable is determined by comparing the dollar1 and dollar2 instances with equals(). 
If the equals() method is not overridden, it only compares the memory addresses of these two objects. 
Therefore, since dollar1 and dollar2 are two different objects, the result will be false.
To change this behavior, you need to override the equals() method in your class 
and make it compare the amount fields of the two Dollar instances. Here's how you can do it:

    @Override
    public boolean equals(Object obj) {

    if (this == obj) {
    return true;
    }

    if (obj == null || this.getClass() != obj.getClass()) {
        return false;
    }

    Dollar dollar = (Dollar) obj;
    return this.amount == dollar.amount;
    }

This code checks whether the amount fields of the Dollar objects are equal. 
If they are, it returns true; otherwise, it returns false. 
This way, the equals() method allows comparing two Dollar objects based on their amount fields.

In summary, comparing two Dollar objects using the equals() method 
depends on their memory addresses unless the method is overridden. 
However, when the equals() method is properly overridden, 
the comparison is based on the data contained within the objects.
