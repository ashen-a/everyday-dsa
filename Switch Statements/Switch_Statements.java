import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        int day = in.nextInt();

        // if(fruit.equals("mango"))
        switch(fruit){
            // Enhanced switch statement
            /*  case "Mango" -> {
                                System.out.println("King of Fruits")
                                };    */

            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("a sweet red fruit");
                break;
            case "Orange":
                System.out.println("a round fruit");
                break;
            case "Grapes":
                System.out.println("a small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
        // For the enhanced switch statement
        // switch (day) {
        //     case 1,2,3,4,5 -> System.out.println("Weekday");
        //     case 6,7 -> System.out.println("Weekend");
        // }
    }
    
}
