import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = { 1, 55, 66, 77, 87, 922, -89, 6, 7 };
        int target = 87;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch2(int[] arr, int target){
        
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int element : arr) {
            if(element == target)
                return element;
        }

        // if target not found
        return Integer.MAX_VALUE;
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1 
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {

            int element = arr[index];
            if (element == target)
                return index;
        }

        // if target not found
        return -1;
    }

}
