public class FactorialUsingRecursion {
    static void main() {
        int n = 5;
        System.out.println(factorial(5));
    }
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

}
