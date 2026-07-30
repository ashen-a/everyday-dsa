import java.util.Arrays;

// using just one variable instead of s, l
public class ReverseArrayUsingOneVariable {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        rev(arr, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void rev(int[] arr, int s) {
        if (s >= (arr.length-1) / 2) {
            return;
        }
        swap(arr, s, arr.length-s-1);
        rev(arr, s+1);
    }

    static void swap(int[]arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
