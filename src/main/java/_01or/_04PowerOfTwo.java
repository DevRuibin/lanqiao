package _01or;

import org.junit.Assert;

public class _04PowerOfTwo {
    public static void main(String[] args) {
        final int n1 = 1;
        final int n2 = 1024;
        final int n3 = 1025;

        boolean flagN1 = _03Count1.m1(n1) == 1;
        boolean flagN2 = _03Count1.m1(n2) == 1;
        boolean flagN3 = _03Count1.m1(n3) == 1;

        Assert.assertTrue(flagN1);
        Assert.assertTrue(flagN2);
        Assert.assertFalse(flagN3);
    }
}
