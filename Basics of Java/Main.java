// A variable with first letter in UPPERCASE is name of a CLASS (by CONVENTION)

import java.util.Scanner;

public class Main  // PUBLIC - this class can be accessed from anywhere
{   
    public static void main(String[] args)
    {
        System.out.println("Hello World!"); // In STANDARD OUTPUT STREAM print something
        // System.out means your command line i.e your display
        /*decoding the above statement
         * "System" has a variable called "out" which is of type PrintStream and this out has a METHOD called "println", println is also in PrintStream(it is a class aswell)
         */
        System.out.println(args[0]);
    
        // TAKING INPUTS
         Scanner input = new Scanner(System.in);// System.in : standard input stream (corresponds to the keyboard input)
         System.out.println(input.nextInt());
    
    
    
    }
} 
/*
    NOTES:
    -All the functions that in the classes are called METHODS
    -main function is the ENTRY POINT of the java program, hence it is kept
    public
    -STATIC because we want to run this main function without creating an      object of this Main Class     
    -VOID indicates the main function does not return any value
    -String[] args is the command line argument
    -commands like "javac" "java" are executable files that are located somewhere on your computer(Learn about ENVIRONMENT VARIABLES)
    - PACKAGE (eg: package com.kunal/ package com.ayush) : it's the folder in which your JAVA file lies; com.ayush - ayush is a sub-folder inside the com folder  
*/