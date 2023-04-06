package _02recursion;

import java.sql.Statement;

public class _01Basic {

    static int f(int n){
        if(n==1){
            return 1;
        }
        return n * f(n - 1);
    }

    static void f2(int i, int j){
        if(i > j){
            return;
        }
        System.out.println(i);
        f2(i+1, j);
    }

    static int f3(int[] arr, int begin){
        if(begin==arr.length-1){
            return arr[begin];
        }
        return arr[begin] + f3(arr, begin+1);
    }

    static String reverse(String src, int end){
        if(end==0){
            return String.valueOf(src.charAt(0));
        }
        return src.charAt(end) + reverse(src, end-1);
    }

    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    static int gcd(int m, int n){
        if(n==0){
            return m;
        }
        return gcd(n, m%n);
    }

    static void insertSort(int[] arr, int k){
        if(k==0){
            return;
        }
        insertSort(arr, k-1);
        int x = arr[k];
        int index = k-1;
        while (index > -1 && x < arr[index]){
            arr[index+1] = arr[index];
            index--;
        }
        arr[index+1] = x;
    }



}


