package example9;

abstract class Money {

    protected int amount;

    /*
    We can introduce a factory method in Money that returns a Dollar.
    Decoupled test code from the existence of concrete subclasses by introducing factory methods
    implementation creates and returns a Dollar:
     */
    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
        && getClass().equals(money.getClass());
    }
}
