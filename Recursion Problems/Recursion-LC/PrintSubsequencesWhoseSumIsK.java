import java.util.ArrayList;

public class PrintSubsequencesWhoseSumIsK {
    static void main() {
        int[] arr = {1, 2, 1};
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int k = 2;
        subs(arr, index, list, sum, k);
    }

    static void subs(int[] arr, int ind, ArrayList<Integer> list, int sum, int k) {
        if (ind == arr.length) {
            if (sum == k) {
                System.out.println(list);
            }
            return;

        }
        sum += arr[ind];
        list.add(arr[ind]);
        subs(arr, ind + 1, list, sum, k);

        sum -= arr[ind];
        list.remove(list.size()-1);
        subs(arr, ind + 1, list, sum, k);
    }
}
