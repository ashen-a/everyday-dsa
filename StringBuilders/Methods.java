package S_Builders;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Ayush Das";
        System.out.println(Arrays.toString(name.toCharArray()));
        name.toLowerCase(); //  A NEW IBJ IS CREATED
        System.out.println(name); // THE ORIGINAL ONE REMAINS THE SAME 
        System.out.println(name.indexOf('a')); // GIVES THE FIRST INDEX THE CHARACTER
        System.out.println("      Ayush Das      ".strip());
        System.out.println(Arrays.toString(name.split(" "))); // ["Ayush", "Das"]
        
    }
}
