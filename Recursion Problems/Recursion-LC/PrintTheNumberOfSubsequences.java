import java.util.ArrayList;

public class PrintTheNumberOfSubsequences {
    static void main() {
        int[] arr = {1, 2, 1};
        int target = 2;

        System.out.println(subs(arr, target,0, 0));

    }
    static int subs(int[] arr, int target, int i, int s) {
        // Another base case to optimize the complexity
        if (s > target) return 0;

        if (i == arr.length) {
            // condition satisfied
            if (s == target) {
                return 1;
            }
            // condition not satisfied
            return 0;
        }
        s += arr[i];
        int l = subs(arr, target,i+1, s);

        s -= arr[i];
        int r = subs(arr, target,i+1, s);

        return l+r;
    }
}
