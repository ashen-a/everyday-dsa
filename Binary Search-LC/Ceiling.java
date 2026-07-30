/*  CEILING- Smallest element in the array greater than or equal to the target element 
    Basic while loop condition of binary search --- start <= end
    For this question the loop breaking condition will be --- start > end  
    NOTE:
    start ans end // if the ans existed in the array
    end ans(target) start // condition violated, for this question if the target element existed in the array it would be lying b/w end and start here
*/

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    // return the index of the smaallest number >= target
    
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        // but what if the target element is greater than the greatest number in the array
        if(target > arr[arr.length - 1])
            return -1;
        
        while(start <= end){ // when this condition breaks, start = end/mid + 1 
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
     return start;
    }
} 
