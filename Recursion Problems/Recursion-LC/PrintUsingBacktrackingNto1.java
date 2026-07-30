// Print from n to 1 linearly using backtracking

public class PrintUsingBacktrackingNto1 {
    public static void main(String[] args) {
        int n = 3;
        print(1, n);
    }
    static void print(int i, int n){
        if (i > n) {
            return;
        }
        print(i+1, n);
        System.out.println(i);
    }
}
