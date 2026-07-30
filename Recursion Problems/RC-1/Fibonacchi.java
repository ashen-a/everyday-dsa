package RC;
// Nth Fibonacci Number 
public class Fibonacchi {
    public static void main(String[] args) {
        // Try to figure out if the problem can be broken down into smaller problems
        // Example: Fibo(N) = Fibo(N-1) + Fibo(N-2)
        System.out.println(fibo(4));
    
    }
    static int fibo(int n){
        // base condition
        if (n < 2){ // n == 1 or n == 0
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
