package example10;


abstract class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return currency;
    };
     abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }


    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
        && getClass().equals(money.getClass());
    }
    public String toString() {
        return amount + " " + currency; }

}
