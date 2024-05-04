package example6;
/*
A prerequisite seems to be having an object like Dollar, but to represent francs.
If we can get the object Franc to work the way that the object Dollar works now,
we’ll be closer to being able to write and run the mixed addition test.
We can copy and edit the Dollar test:

 */
/*
We actually got a new test case working.
But we sinned mightily in copying and pasting tons of code in order to do it quickly.
Now it is time to clean up.
 */

public class Franc {
    private final int amount;

    Franc(int amount) {
        this.amount = amount;
    }
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
/*
We
Wrote the test by shamelessly duplicating and editing •
Even worse, made the test work by copying and editing model code wholesale
• Promised ourselves we wouldn’t go home until the duplication was gone
 */
/*
we sinned mightily in copying and pasting tons of code in order to do it quickly.
Now it is time to clean up.
 */
