package RC;

public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers : 1 2 3 4 5
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    // func body here changes
    static void print5(int n){
        System.out.println(n);
        
    }
}
/*
    HOW FUNCTION CALL OPERATES IN LANGUAGES

    --> ANY FUNCTION CURRENTLY RUNNING GOES IN THE STACK MEMORY WITH IT'S PRIMITIVES
    --> SINCE MAIN IS THE FIRST FUNCTION THAT IS CALLED IT IS AT THE BOTTOM OF THE STACK MEMORY
    --> WHILE THE FUNCTION IS NOT FINISHED EXECUTING IT WILL REMAIN IN THE STACK
    --> WHEN A FUNCTION FINISHES EXECUTING IT IS REMOVED FROM THE STACK AND FLOW OF PROGRAM IS 
        RESTORED TO WHERE THE FUNCTION WAS CALLED FROM
    --> MAIN FUNCTION IS THE THAT LAST FUNCTION THAT IS REMOVED FROM THE STACK
*/