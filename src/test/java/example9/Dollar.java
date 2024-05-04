package example9;

public class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }
    /*
    let's to modify the times() method in both the Franc and Dollar classes
    to return a Money type
     */
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
