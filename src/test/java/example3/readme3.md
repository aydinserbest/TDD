1-Object Immutability: When an object is created, 
its internal state can be made immutable. 
For example, consider a Dollar class:

        public class Dollar {
    private final int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}

Here, the amount variable is defined as final and is set only in the constructor. 
This way, once the object is created, its amount cannot be changed. 
This makes the object immutable.

2-Preventing Aliasing Problems: 
Aliasing occurs when two objects share the same reference, 
causing changes to one to affect the other. 
For example, let's create two Dollar objects:

        Dollar dollar1 = new Dollar(5);
        Dollar dollar2 = new Dollar(5);

Both represent 5 dollars, 
but they are independent of each other. 
If the Dollar class has a private amount variable that cannot be modified, 
changes to dollar1 will not affect dollar2. This prevents aliasing issues.

3-Triangulate: Triangulation is a method for generalizing code by using two or more examples. 
For instance, when testing the equals() method of the Dollar class, we can write two tests:

        public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));  // First example
        assertFalse(new Dollar(5).equals(new Dollar(6))); // Second example
        }

These tests examine the equality of Dollar objects from both positive and negative perspectives. 
Initially, the equals() method might simply return true, 
but after seeing these tests, we can refine it to:

        public boolean equals(Object obj) {
        if (!(obj instanceof Dollar)) return false;
        Dollar other = (Dollar) obj;
        return this.amount == other.amount;
        }

This demonstrates the triangulation process: starting with simple tests, 
then gradually generalizing and refining the code based on multiple examples.

