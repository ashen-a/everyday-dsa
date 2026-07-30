// LC - 448
// Given an array nums of n integers where nums[i] is in the range [1, n]
// return an array of all the integers in the range [1, n] that do not appear in nums
// If range --> [0, n] --> every element will be at index == value
// If range --> [1, n] --> every element will be at index == value - 1

import java.util.ArrayList;
import java.util.List;

public class AllNumbersDisappeared {
    static void main() {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums){
        int index = 0;

        // to sort the array
        while (index < nums.length) {
            int correctIndex = nums[index] - 1;

            if(nums[index] < nums.length && nums[index] < nums[correctIndex]) {
                swap(nums, index, correctIndex);
            }else {
                index++;
            }
        }

        // array is sorted, find the missing number
        // {1, 2, 3, 4, 3, 2, 7, 8}
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[index] != index + 1){
                list.add(index + 1);
            }
        }

        return list;
    }

    static void swap(int[] arr, int index, int correctIndex) {
        int temp = arr[index];
        arr[index] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}
