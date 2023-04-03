package _01or;

import org.junit.Assert;

import java.util.Random;

public class _03Count1 {
    public static void main(String[] args) {
        int n = new Random().nextInt();
        Assert.assertEquals(m1(n), m2(n));
        Assert.assertEquals(m1(n), m3(n));
    }

    public static int m1(int n){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if((n & (1<<i))==(1<<i)){
                count++;
            }
        }
        return count;
    }

    public static int m2(int n){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((n >> i) & 1) == 1){
                count++;
            }
        }
        return count;
    }

    public static int m3(int n){
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }

}

