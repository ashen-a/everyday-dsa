import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
        // int[][] arr = new int[3][]; // Number of columns is not necessary to specify since each array is a different object 

        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5},
        //     {6, 7, 8, 9}
        //                  }  

        // A 2D array is a collection of ref variables each pointing to different arrays in the heap memory
        // Suppose arr[1] = [1, 2, 3]
        // Then    arr[1][0] = 1


        int[][] arr = new int[3][2];
        System.out.println(arr.length); // This gives the number of rows
        
        
        // INPUT
        for (int row = 0; row < arr.length; row++) {
            
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //OUTPUT
        for (int row = 0; row < arr.length; row++) {
            
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        
        
        // Alternative output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        
        
        // ENHANCED FOR LOOP FOR OUTPUT
        for(int[] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
