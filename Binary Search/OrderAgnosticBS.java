public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12 , -4 , 0 , 2 , 3 , 4 , 15 , 16 , 18 , 22 , 45};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];


        while(start <= end){
            // int mid = (start + end)/ 2; might be possible that (start + end) value exceeds the range of integer
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            // for ascending
            if(isAsc){
                if (target < arr[mid]){
                mid = mid - 1;
            }else if (target > arr[mid]){
                start = start + 1;
            }
            }else{  // for descending
                if (target > arr[mid]){
                mid = mid - 1;
            }else if (target < arr[mid]){
                start = start + 1;
            }
            }
            
        }
     return -1;
    }
}
