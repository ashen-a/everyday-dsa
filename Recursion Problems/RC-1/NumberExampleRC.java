package RC;

public class NumberExampleRC {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers : 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        // Base Condition 
        if (n == 5){
            System.out.println(5);
            return;
        }
        
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack 
        // Therefore Space Complexity is not constant because of the recursive calls
        
        
        // this is called tail recursion
        // this is the last function call
        print(n + 1);
    }
}
/*
    no base condition? --> func calls will keep happening, stack will be filled again and again 
                       --> memory of computer will exceed the limit --> STACK OVERFLOW ERROR
*/

/*
    WHY RECURSION?
    --> you can convert recursion soln into iteration and vice versa
    --> Space complexity is not constant because of recursive calls 
*/