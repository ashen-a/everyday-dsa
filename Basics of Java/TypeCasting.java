import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // float num = input.nextFloat();
        // You cannot do the vice - versa because int is smaller than float

        // type-casting
        // int num = (int)(67.56f);
        // System.out.println(num);

        // automatic type promotion in expressions
        // int a = 257;
        // int a1 = 250;
        // byte b = (byte)a; // 257 % 256 = 1
        // byte b = (byte)a1; // -6
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c; // during these evaluations the expression is
        // automatically converted to "int", hence it is stored in an integer value

        // System.out.println(d);

        // byte b = 50;
        // b = (byte)(b * 2); // since the expression is converted to an int value it caannot be stored into a byte variable without explicit conversion
        // System.out.println(b);

        // JAVA FOLLOWS THE UNICODE PRINCIPLES
        // int number = 'A';
        // System.out.println(number);

        /* RULES FOR TYPE PROMOTION
         * All the byte, short and character values are promoted to integer 
         */

         byte b = 42;
         char c = 'a';
         short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1233456;
        double result = (f * b) + (i / c) - (d - s) ; 
        // float + int - double = double 
        System.out.println(((f * b) + " " + (i / c) + " " + (d - s)));
        System.out.println(result);
        

    }

}
