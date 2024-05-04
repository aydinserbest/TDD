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

