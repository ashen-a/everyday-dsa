import java.util.Arrays;

public class PassingintoFunctions {
    public static void main(String[] args) {
       
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        
        
        change(nums); // A copy of this ref variable is passed into the function
        System.out.println(Arrays.toString(nums)); // 99
    }
    static void change(int[] arr) // arr is the name of the ref varibale in the function, it is pointing to the same object that is [3, 4, 5, 12]
    {
        arr[0] = 99; // ARRAYS ARE MUTABLE - You can change the object
    }
}
