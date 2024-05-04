package example9;

abstract class Money {

    protected int amount;

    /*
    We can introduce a factory method in Money that returns a Dollar.
    implementation creates and returns a Dollar:
     */
    static Money dollar(int amount) {
        return new Dollar(amount); }
    abstract Money times(int multiplier);

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
        && getClass().equals(money.getClass());
    }
}
