package plus1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void testSimpleAddition() {
        Money sum = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), sum);
    }
    @Test
    public void testSimpleAddition2() {
        Money sum = Money.dollar(5).plus(Money.franc(5));
        System.out.println(sum.currency);
        assertEquals(Money.dollar(10), sum);
    }
    @Test
    public void testSimpleAddition3() {
        Money sum = Money.franc(5).plus(Money.dollar(5));
        System.out.println(sum.currency);
        assertEquals(Money.dollar(10), sum);
    }

}
