package _01or;

import org.junit.Assert;

public class _05ExchangeParity {

    public static void main(String[] args) {
        int a = 6;
        int expected = 9;
        Assert.assertEquals(expected, m1(a));
        Assert.assertEquals(expected, m2(a));

    }

    public static int m1(int i){
        int odd = i & 0x55555555;
        int even = i & 0xaaaaaaaa;
        return (odd<<1) ^ (even>>1);
    }

    public static int m2(int i){
        int odd = i & 0x55555555;
        int even = i & 0xaaaaaaaa;
        return (odd<<1) | (even>>1);
    }
}
