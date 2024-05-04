package example10;

abstract class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    String currency(){
         return currency;
     };
     Money times(int multiplier){
         return null;
     };

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }


    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
        && getClass().equals(money.getClass());
    }
    public String toString() { return amount + " " + currency; }

}
