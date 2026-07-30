// Parameterised --> when there are patterns

public class SumOfFirstNnumbersParam {
    static void main() {
        int n = 3;      // take any user-input
        summation(n, 0);
    }
    static void summation(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        summation(i-1, sum+i);  // this could have been done in i + 1 way
    }
}
