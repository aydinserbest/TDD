package plus3;


public class Money implements Expression {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    String currency(){
         return currency;
     };
    Money times(int multiplier){
         return new Money(amount * multiplier, currency);
     };

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }


    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
        && currency().equals(money.currency());
    }
    public String toString() {
        return amount + " " + currency; }

    public Expression plus(Money addend) {

        return new Sum(this, addend);
    }
    public Money reduce(String to) { return this; }
}