package example10;

public class Franc extends Money {
    private String currency;

    Franc(int amount) {
        super(amount, "CHF");
    }


    Money times(int multiplier) {

        return Money.franc(amount * multiplier);
    }
}

