public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1]; // since we want to include 40(n) in the array 
        // Initially all the elements in the boolean array are going to be false
        seive(n, prime);
    }
    // false in array means the number is prime
    static void seive(int n, boolean[] prime){
        for (int i = 2; i*i < n; i++) { // Ignore n = 0, 1 
            
            if(!prime[i]){
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true; // true since the number is composite
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.println(i + " ");
            }
        }
    }
}
