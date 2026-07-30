import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        // input using for loops
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); 
        }

        // Best method to print an array 
        System.out.println(Arrays.toString(arr)); // Arrays class has a toString method

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // Enhanced for loop
        // for(int num : arr) // for every element in the array, print the element
        // {
        //     System.out.print(num + " "); // here num represents element of the array
        // }

        // System.out.println(arr[5]); index out of bound error

        // array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str)); 
    }
}
