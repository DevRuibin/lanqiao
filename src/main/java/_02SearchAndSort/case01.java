package _02SearchAndSort;

public class case01 {

    private static int f(int n){
        if(n==1) return 1;
        if(n==0) return 1;
        if(n==2) return 2;
        return f(n-1) + f(n-2) + f(n-3);
    }
}
