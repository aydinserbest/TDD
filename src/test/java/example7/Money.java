package example7;

public class Money {
    /*
    the equals method in the Money class has been updated to check not only the amounts
    but also the classes (i.e., the currencies) of the objects:
     */

    protected int amount;
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
        && getClass().equals(money.getClass());
    }
}
/*
"i.e., the currencies" is used to clarify that "the classes of the objects" refers specifically
to the types of currencies represented by those classes.
In object-oriented programming, each class can represent a different type of object.
Here, the Franc and Dollar classes are used to represent different types of currencies.
So, when I mentioned "the classes (i.e., the currencies) of the objects,"
it means that the equals method checks whether the objects belong to the same class—essentially
confirming they are of the same currency type (e.g., both are Francs or both are Dollars),
not just that they hold the same numeric amount.
 */
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
