package example9;

public class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    /*
        Now there is no difference between Franc.equals() and Money.equals(),
        so we delete the redundant implementation in Franc.
         */
}
