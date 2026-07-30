package S_Builders;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        // Anything you call print in println it calls the toString method
        // SEQUENCE --> .valueOf --> .toString
        System.out.println(56); // println method takes int type as input
        Integer num = new Integer(56); // By introducing WRAPPER CLASS we can implement the functions of OOP
        System.out.println(num); // 56

        System.out.println("Ayush"); //  String input
        
        System.out.println(new int []{2, 3, 4, 5}); // Object input(Objects can be of many type)
        // A random value is being printed for the above expression
       
        // Instead; Function Over riding
        System.out.println(Arrays.toString(new int []{2, 3, 4, 5})); // Object input(Objects can be of many type)

    }
}
