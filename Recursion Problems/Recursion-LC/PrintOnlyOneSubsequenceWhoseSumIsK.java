import java.util.ArrayList;

public class PrintOnlyOneSubsequenceWhoseSumIsK {
    static void main() {
        int[] arr = { 1, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 2;
        int index = 0;
        int s = 0;
        subs(arr, list, sum, index, s);
    }
    static boolean subs(int[]arr , ArrayList<Integer> list, int sum, int ind, int s) {
        // base condition
        if (ind == arr.length) {
            if (s == sum) {
                System.out.println(list);
                return true;
            }

            return false;
        }
        list.add(arr[ind]);
        s += arr[ind];
        if (subs(arr, list, sum, ind+1, s)) {
            return true;
        }

        s -= arr[ind];
        list.remove(list.size()-1);
        if (subs(arr, list, sum, ind+1, s)) {
            return true;
        }

        return false;
    }

}
