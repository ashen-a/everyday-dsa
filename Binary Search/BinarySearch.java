// Best Case - O(1) --> Constant 
// Worst Case -->   N/2^k = 1 --> N = 2^k --> Taking log --> logN = klog2 --> k = logN/log2 --> k = logN base 2 ; k is the total number of levels in the worst case 
// Total Comparisions in the worst case = log(N) ; We ignore constants in space and time complexity

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12 , -4 , 0 , 2 , 3 , 4 , 15 , 16 , 18 , 22 , 45};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        
        while(start <= end){ // when this condition breaks, start = end + 1 (FLOOR)
            // int mid = (start + end)/ 2; might be possible that (start + end) value exceeds the range of integer
            int mid = start + (end-start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                // ans found
                return mid;
            }  
        }
     return -1;
    }
}
