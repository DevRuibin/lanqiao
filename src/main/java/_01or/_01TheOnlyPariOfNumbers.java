package _01or;

import java.util.Random;

import org.junit.Assert;
import org.junit.runners.JUnit4;
import util.Util;

public class _01TheOnlyPariOfNumbers {
    public static void main(String[] args) {
        final int N = 1001;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        arr[N -1] = new Random().nextInt(N-1) + 1;
        int index = new Random().nextInt(N);
        Util.swap(arr, index, N-1);
        int x1 = 0;
        for (int i = 1; i < N; i++) {
            x1 = (x1 ^ i);
        }
        for (int i = 0; i < N; i++) {
            x1 = x1 ^ arr[i];
        }

        Assert.assertEquals(x1, forceSolve(arr));


    }

    public static int forceSolve(int[] arr){
        int[] helper = new int[arr.length];
        for (int j : arr) {
            helper[j]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(helper[i]==2){
                return i;
            }
        }
        return -1;
    }
}
