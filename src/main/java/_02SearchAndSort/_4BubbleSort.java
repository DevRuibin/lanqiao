package _02SearchAndSort;

import util.Util;

public class _4BubbleSort {
    static void sort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - j - 1; j++) {
                if(arr[i] > arr[i + 1]){
                    Util.swap(arr, i, i + 1);
                }

            }
        }
    }
}
