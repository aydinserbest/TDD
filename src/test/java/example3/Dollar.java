package example3;

public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }
    /*
    How to Fix It
    To fix this issue, the times method should be redesigned
    to return a new Dollar object without modifying the current one

    This allows the times method to return a new Dollar object with the multiplied value,
    leaving the original Dollar object unchanged
     */

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    /*
    This ensures that each times call generates a new Dollar object,
    preventing persistent changes to the original object's state
    and allowing the test to pass smoothly.
     */
}