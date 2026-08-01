import java.util.ArrayList;

public class PrintAllSubsequences {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> list = new ArrayList<>();
        subs(arr, 0, list);
    }

    static void subs(int[] arr, int ind, ArrayList<Integer> list) {

        if (ind == arr.length) {
            System.out.println(list);
            return;
        }

        // Take or pick the particular index into the sequence
        list.add(arr[ind]);
        subs(arr, ind + 1, list);

        // Don't pick, or not take condition, this element is not added to your subsequence
        list.remove(list.size() - 1);
        subs(arr, ind + 1, list);
    }
}

// Time Complexity --> (2^n) * n
// Auxiliary Space/ Stack Space --> O(n)