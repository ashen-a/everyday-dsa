import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 20;
        int b = 10;

        // swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;
        swap(a,b);

        String name = "Ayush Das";
        changeName(name);
        System.out.println(name);
        
        System.out.println(a + " " + b);
    }
    static void changeName(String naam)
    {// the naam variable is available within the scope of this function only
        naam = "Rahul Rana";

    }
    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        // this change will only be valid in this function scope 
    }
}
