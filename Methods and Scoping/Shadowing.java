public class Shadowing {
    static int x = 90; // CLASS VARIABLE, this will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x);// 90
        int x; // LOCAL VARIABLE, available in local scope; the CLASS VARIBALE  is shadowed by this
        // System.out.println(x); SHOWS ERROR,scope will begin when value is initialised
        x = 40;
        System.out.println(x); // 40
        fun(); // 90
        
    }
    static void fun()
    {
        System.out.println(x);
    }
    
}
