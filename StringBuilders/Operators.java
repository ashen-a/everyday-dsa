package S_Builders;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 1); // 100
        System.out.println("a" + 'b'); // ab 
        
        System.out.println("a" + 1); // a1
        // this is same as after a few steps
        // integer will be converted to Integer that will call toString()

        System.out.println("Ayush" + new ArrayList<>()); // object; Ayush[] 
        System.out.println("Ayush" + new Integer(56)); // object; Ayush56
        
        // Error
        // System.out.println(new ArrayList<>() + new Integer(56)); // object; Ayush56 
        
        // No Error
        System.out.println(new ArrayList<>() + " " + new Integer(56)); // RESULT - STRING TYPE // 56[]
        // The + operator in java is only defined for primitives and when one of them are Strings


    }
}
