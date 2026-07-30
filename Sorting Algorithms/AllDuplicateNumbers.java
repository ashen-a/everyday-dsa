// LC - 442
// range --> [1, n]

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumbers {
    static void main() {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

    }
    public List<Integer> findDuplicates(int[] nums){
        int index = 0;

        while(index < nums.length){
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }else{
                index++;
            }
        }

        // find all the duplicate ones
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[index] != index + 1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
