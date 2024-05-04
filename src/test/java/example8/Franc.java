package example8;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
        /*
        Now there is no difference between Franc.equals() and Money.equals(),
        so we delete the redundant implementation in Franc.
         */
    }
}

