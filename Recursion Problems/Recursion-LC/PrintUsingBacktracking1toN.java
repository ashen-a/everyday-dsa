// Print from 1 to n linearly using Backtracking

public class PrintUsingBacktracking1toN {
    public static void main(String[] args) {
        int n = 3;      // any user input
        print(n, n);
    }
    static void print(int i, int n){
        if(i < 1){
            return;
        }
        print(i-1, n);
        System.out.println(i);
    }
}