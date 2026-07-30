// LC - 268
// if N = 4 then arr --> {0, 1, 2, 3, 4} so index = valueAtIndex
// N = 3, arr = [1, 3, 0] --> array given --> ans = 2

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];

            if (arr[i] <= arr.length - 1 && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;   // hence that particular index is missing so return it
            }
        }
        
        // case 2
        return arr.length;

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
