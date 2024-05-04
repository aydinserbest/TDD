package example10;

public class Dollar extends Money {
    private String currency;

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String currency() {
        return "USD";
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
