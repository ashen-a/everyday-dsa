import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        

        // FOR LOOPS
        // for(int num = 1; num <= 5; num += 2)
        // {
        //     System.out.println(num);
        // }

        // Q : Print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for (int num = 1; i <= n; i++) {
        //     System.out.println(num); ;
        // }
        

        // WHILE LOOPS
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 2;
        }
    // Use a WHILE LOOP when you know how many times your loop is going to run,use a FOR LOOP when you know how many time your loop is going to run

        // DO WHILE
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n <= 5);
    }
    
}
