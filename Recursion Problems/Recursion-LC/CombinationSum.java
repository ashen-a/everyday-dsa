import java.util.ArrayList;
import java.util.List;

// Always go through this pick and not pick procedure
public class CombinationSum {
    static void main() {

    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, 0, result, new ArrayList<>());
        return result;
    }
    static void helper(int[] arr, int target, int ind, List<List<Integer>> result, List<Integer> current) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (ind == arr.length || 0) {
            return;
        }

        // pick
        current.add(arr[ind]);
        helper(arr, target-arr[ind], ind, result, current);

        current.remove(current.size()-1);
        // not pick
        helper(arr, target, ind+1, result, current);
    }
}