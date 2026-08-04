import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

// For brute force approach you can use the power set approach --> (2 ^ n) * n complexity
// Print the sum of all the subsets in ascending order
public class SubsetSum {
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    static void func(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        // pick the element
        func(ind+1, sum + arr.get(ind), arr, N, sumSubset);

        // Do not pick the element
        func(ind+1, sum, arr, N, sumSubset);
    }
    static void main() {

    }

}
