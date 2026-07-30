// LC - 1095
// Search for an element in a Mountain Array
// CONCEPT: --> Find peak element
            // --> BS in the asc array 
            // --> if not found BS int the dec array
public class SearchInMountain {
    public static void main(String[] args) {
        // Initialize the array and take target from user
    }
    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1)
            return firstTry;
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }
    
    // To find the peak index
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-start) / 2 ;
            if(arr[mid] > arr[mid + 1]){
                // you are in dec part of array
                // this may be the ans, but look at left 
                // this is why is end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know mid + 1 element > mid element 
            }
        }
       return start; // or return end as they both are equal 
    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];


        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            // for ascending
            if(isAsc){
                if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }
            }else{  // for descending
                if (target > arr[mid]){
                end = mid - 1;
            }else if (target < arr[mid]){
                start = mid + 1;
            }
            }
            
        }
     return -1;
    }

}


