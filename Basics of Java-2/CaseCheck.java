import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);  // charAt() is returning a char type
        // trim() trims the extra white spaces    
        // in.next() takes in the next word     

        if(ch > 'a' && ch < 'z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }
    }
    
}
