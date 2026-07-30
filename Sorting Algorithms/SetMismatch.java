// LC - 645
// range --> [1, n]

public class SetMismatch {
    static void main() {
        int[] nums = {1, 2, 2, 4};      // Output: [2, 3]

    }
    static int[] findErrorNums(int[] arr){
        int index = 0;

        while(index < arr.length){
            int correctIndex = arr[index] - 1;
            if(arr[index] != arr[correctIndex]){
                swap(arr, index, correctIndex);
            }else {
                index++;
            }
        }

        // Search for the duplicate and missing number
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != index + 1){
                return new int[]{arr[i], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
