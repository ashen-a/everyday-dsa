import java.util.Arrays;

public class VarArgs {
    // VARIABLE LENGTH ARGUMENTS
    public static void main(String[] args) {
        fun(2,56,3,4,2,89,99,100);
        multiple(2, 3, "Kunal", "Rahul", "Ayush");
        // demo(); results in AMBIGUITY
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a , int b, String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));// the output is in the format of an ARRAY
    }
}
