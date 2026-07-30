import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selection(arr);   
        System.out.println(Arrays.toString(arr));
    }


    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index 
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            swap(arr, maxIndex, lastIndex);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}


// Selecting an element and putting it in it's correct index, like selecting the largest/smallest element and putting it in it's correct position
// COMPLEXITY ANALYSIS:
// Total comaparisions = 0 + 1 + 2 + 3 + ....... + (n-1) = n(n-1)/2 = O(n^2)  // Constants and less dominating terms are removed

// worst case = best case = O(N^2)
// Stable = NO
// it performs well on small lists/arrays