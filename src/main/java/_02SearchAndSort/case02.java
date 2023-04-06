package _02SearchAndSort;

public class case02 {
    static int min(int[] arr){
        int begin = 0;
        int end = arr.length -1;
        if(arr[begin] < arr[end]) return arr[begin];

        while (begin + 1 < end){
            int mid = begin + ((end - begin)) >> 1;

            if(arr[mid] >= arr[begin]){
                begin = mid;
            }else {
                end = mid;
            }
        }
        return arr[end];
    }
}
