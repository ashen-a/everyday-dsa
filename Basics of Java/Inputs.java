import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // System.out.print("Please enter some input : ");
        // int rno = input.nextInt(); // Names of variables, methods is called an IDENTIFIER
        // System.out.println("Your roll no is " + rno);

        String fullname = input.nextLine();
        System.out.println(fullname);

        String name = input.next();
        System.out.println(name);
    }
    
}
