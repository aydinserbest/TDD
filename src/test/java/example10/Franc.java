package example10;

public class Franc extends Money {
    private String currency;

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return currency;
    }

    Money times(int multiplier) {

        return new Money(amount * multiplier, currency);
    }
}

