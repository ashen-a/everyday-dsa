import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String message = greet();
        System.out.println(message);
        // int ans = sum3(20,40);
        // System.out.println(ans);
        System.out.println("Enter your name: ");
        String name = in.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }
    // pass the value of numbers when you are calling the method in main()
    // static int sum3(int a,int b)
    // {
    // int sum = a + b;
    // return sum;
    // }

    static String myGreet(String name) {
        String message = "Hello" + name;
        return message;
    }

    static String greet() {
        String greeting = "Hello world";
        return greeting;
    }

}
