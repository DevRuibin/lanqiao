package _01or;

import org.junit.Assert;

public class _7UniqueNumber {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 9, 7, 7, 7, 3, 3, 3, 6, 6, 6, 0, 0, 0};
        int expected = 9;
        int k=3;
        int actual = m(arr, k);
        Assert.assertEquals(expected, actual);

    }

    public static int m(int[] arr, int k){
        int len = arr.length;
        char[][] kRadix = new char[len][];
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            kRadix[i] = new StringBuilder(Integer.toString(arr[i], k)).reverse().toString().toCharArray();
            if(kRadix[i].length > maxLen){
                maxLen = kRadix[i].length;
            }
        }

        int[] resArr = new int[maxLen];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < maxLen; j++) {
                if(j >= kRadix[i].length){
                    resArr[j] += 0;
                }else {
                    resArr[j] += (kRadix[i][j] - '0');
                }
            }
        }

        int res = 0;
        for (int i = 0; i < maxLen; i++) {
            res+=(resArr[i] % k) * (int) (Math.pow(k, i));
        }
        return res;
    }
}
