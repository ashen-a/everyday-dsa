package S_Builders;

public class Comparision {
    public static void main(String[] args) {  // Stores the command line arguments (javac and java file_name)
        String a = "Kunal";
        String b = "Kunal";
        String c = a;
        System.out.println(c == a); // true
       
        // == Comparision operator
        // Checks if the ref variables are pointing to the same object
        System.out.println(a == b); // would have been false if there were 2 objects of "Kunal" and a,b pointing to each


        // How to create different objects of same value
        String p = new String("Ayush");
        String q = new String("Ayush");
        // Creating these values outside the POOL but inside the HEAP
        System.out.println(p == q); // false 

        // To only check values
        System.out.println(p.equals(q)); // true

        System.out.println(p.charAt(0)); // K 
    }
}
