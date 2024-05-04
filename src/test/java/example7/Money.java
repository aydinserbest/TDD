package example7;

public class Money {

    protected int amount;
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
        && getClass().equals(money.getClass());
    }
}
/*

    The program does not compile.the old version :
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount:
    }
    revised.

    the tests technically passed, meaning they did not produce an error,
    but they did not produce the correct logical results.
    Thus, the program may run without error, but it does not produce correct logical outcomes
     */
