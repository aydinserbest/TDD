package example9;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }
    /*
    let's to modify the times() method in both the Franc and Dollar classes
    to return a Money type
     */
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}

