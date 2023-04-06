package _02SearchAndSort;

public class _2ShellSort {
    public static void shellSort(int[] arr){
        for (int interval = arr.length / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < arr.length; i++) {
                int target = arr[i];
                int j = i - interval;
                while (j > -1 && target < arr[j]){
                    arr[j + interval] = arr[j];
                    j -= interval;
                }
                arr[j + interval] = target;
            }

        }
    }
}
