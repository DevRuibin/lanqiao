package _02SearchAndSort;

public class _3InsertionSort {
    public static void sort(int[] arr, int low, int high){
        for(int j = low + 1; j <= high; j++){
            int key = arr[j];
            int pre = j -1;
            while (pre >= low && arr[pre] > key){
                arr[pre + 1] = arr[pre];
                pre--;
            }
            arr[pre + 1] = key;
        }
    }

    static void sortInverse(int[] arr, int low, int high){
        for(int j = low + 1; j <= high; j++){
            int key = arr[j];
            int pre = j-1;
            while (pre >= low && arr[pre] < key){
                arr[pre + 1] = arr[pre];
                pre--;
            }
            arr[pre + 1] = key;
        }
    }
}
