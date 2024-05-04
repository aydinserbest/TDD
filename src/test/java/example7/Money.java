package example7;

public class Money {
    /*
    A common superclass for two classes What if we had a Money class to capture the common equals code?
     */
    //The visibility has to change from private to protected so that the subclass can still see it.

    protected int amount;
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
    /*
    the tests technically passed, meaning they did not produce an error,
    but they did not produce the correct logical results.
    Thus, the program may run without error, but it does not produce correct logical outcomes
     */
