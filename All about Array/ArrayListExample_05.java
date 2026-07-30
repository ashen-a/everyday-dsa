import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10); // ArrayList is a Class, Integer - Wrapper Class

        list.add(12);
        list.add(45);
        list.add(65);
        list.add(34);
        System.out.println(list);
        
        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}


// HOW IS SIZE NOT FIXED??
// 1. Size if fixed internally
// 2. Let's say the ArrayList fills up by some amont 
//    -- it will create a new arraylist of say double the size
//    -- old elements are copied into new one
//    -- old list is deleted
