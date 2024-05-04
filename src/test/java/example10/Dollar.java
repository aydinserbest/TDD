package example10;

public class Dollar extends Money {
    private String currency;

    Dollar(int amount) {
        super(amount, "USD");
    }

    @Override
    public String currency() {
        return "USD";
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
