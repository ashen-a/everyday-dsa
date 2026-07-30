package S_Builders;

public class Main {
    public static void main(String[] args) {
     // Concepts:
    /*
    --> STRING POOL : It is just a separate memory structure inside the HEAP
    --> WHY? : To avoid re-creation of similiar values of strings  
    String a = "Kunal"
    String b = "Kunal"
    --> Only 1 object will be created hence more OPTIMISED
    --> The 2 ref variables will be pointing to the one object created inside the STRING POOL in the HEAP
     */
    
    // IMMUTABILITY 
    String a = "Ayush";
    System.out.println(a);
    a = "Das"; // Here we not changing the object 'Ayush' but instead creating a new one named 'Das'
    System.out.println(a); // here a is just pointing to the new obj

  }
}
