package _01or;

public class _02UniqueNumber {
    private int find(int[] arr){
        int x = 0;
        for (int j :
                arr) {
            x ^= j;
        }
        return x;
    }
}
