
import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr) {

        int index = 0;

        while (index < arr.length) {
            int correctIndex = arr[index] - 1;
            
            if (arr[index] != arr[correctIndex]) {
                swap(arr, index, correctIndex);
            } else {
                index++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// When given numbers from range 1 - N --> use Cyclic Sort 
// index = valueAtIndex - 1

// Complexity
// arr = [3, 5, 2, 1, 4]
// N - 1 --> 4 swaps are being made + N swaps after the array is sorted 
// (N - 1) + N swaps in total
// O(N)
