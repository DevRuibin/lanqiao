package _02SearchAndSort;

public class _1BinarySearch {
    private static int binarySearch(int[] arr, int low, int high,
                                    int key){
        while (low<=high){
            int mid = low + ((high - low) >> 1);
            int midVal = arr[mid];

            if(midVal < key){
                low = mid + 1;
            }else if(midVal > key){
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -(low + 1);
    }

    private static int binarySearch1(int[] arr, int low, int high, int key){
        if(low > high){
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        int midVal = arr[mid];

        if(mid < key){
            return binarySearch1(arr, mid + 1, high, key);
        }else if(midVal > key){
            return binarySearch1(arr, low, mid -1, key);
        }else {
            return mid;
        }
    }


}
