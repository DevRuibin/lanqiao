package _02recursion;

public class _02TowerOfHanoi {
    static void printHanoiTower(int N, String from, String to, String helper){
        if(N==1){
            System.out.println("move " + N + " from " + from + " to " + to);
            return;
        }
        printHanoiTower(N-1,  from, helper, to);
        System.out.println("move " + N + " from " + from + " to " + to);
        printHanoiTower(N-1, helper, to, from);
    }
}
