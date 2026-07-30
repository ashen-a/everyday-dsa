public class fc_4 {
    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
    }

    // Recursion pattern
    // fact(N) = N * fact(N -1)
    static int fact(int n){
        // Base Case
        if (n <= 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
