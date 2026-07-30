import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rev(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr, int s, int l) {
        if (s >= l) {
            return;
        }
        swap(arr, s, l);
        rev(arr, s + 1, l - 1);
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}