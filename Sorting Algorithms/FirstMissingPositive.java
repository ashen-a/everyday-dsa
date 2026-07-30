// LC - 41
// after sorting the array start checking from 1

//  Ignore elements that are negative and > N
// the first element that doesn't have the correct index will be our answer
public class FirstMissingPositive {
    static void main() {
        int[] nums = {3, 4, -1, 1};     // output --> 2

    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index <= arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
