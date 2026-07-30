public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    // return the index of the greatest number <= target 
    // but what if the target element is smaller than the smallest number in the array
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){ // when this condition breaks, start = end + 1 (FLOOR)
            // int mid = (start + end)/ 2; might be possible that (start + end) value exceeds the range of integer
            int mid = start + (end-start) / 2;
            if (target < arr[mid]){
                mid = mid - 1;
            }else if (target > arr[mid]){
                start = start + 1;
            }else {
                // ans found
                return mid;
            }  
        }
     return end; // for the modified case it automatically becomes -1 if the target element is smaller than the smallest element 
    }
}
