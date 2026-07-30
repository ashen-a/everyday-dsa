import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;  // because the LHS is already sorted, move to the next i
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}

// Concept 
// arr = {5, 4, 1, 2, 3}
// first sort till index --> 0-1 (first pass)
// then sort till index  --> 1-2 (second pass)
// then sort till index  --> 2-3 (third pass)
// then sort till index  --> 3-4 (fourth pass)
// FOR EVERY INDEX --> Put that index element at the correct index of LHS

// i will run from [0, arr.length - 2]
// j = i + 1, j > 0 always
// whenever j is not smaller than the prev element --> break

// Complexity
// Best case --> O(N -1)
// Worst case --> O(N ^ 2)

// Used for small values of N
// Works good for when parts of the array are sorted 