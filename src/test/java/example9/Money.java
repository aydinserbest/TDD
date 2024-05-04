package example9;

public class Money {

    protected int amount;

    /*
    We can introduce a factory method in Money that returns a Dollar.
     */
    static Dollar dollar(int amount) {
        return new Dollar(amount); }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
        && getClass().equals(money.getClass());
    }
}
