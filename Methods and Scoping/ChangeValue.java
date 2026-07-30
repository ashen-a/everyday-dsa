import java.util.Arrays;
import java.util.Scanner;

public class ChangeValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // create an array
        int[] arr = {1,3,6,42,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change (int[] nums)
    {
        nums[0] = 99; // if you make a change to the object via this reference  variable, same object will be changed
    }
}
