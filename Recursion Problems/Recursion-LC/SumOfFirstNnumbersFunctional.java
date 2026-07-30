// Functional -->

public class SumOfFirstNnumbersFunctional {
    static void main() {
        int n = 5;
        System.out.println(summation(n));
    }

    static int summation(int n) {
        if (n == 0) {
            return 0;
        }
        return  n + summation(n-1);
    }
}
