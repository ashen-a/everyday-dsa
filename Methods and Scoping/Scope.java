public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        String name = "Kunal";

        // BLOCK SCOPE
        {
            a = 90; // reassigning the original ref variable to some other value
            int c = 99;
            // values initialized in this block will remain in this block
            name = "Rahul";
            System.out.println(name); // Rahul
        }
        int c = 900; // This holds true
        System.out.println(c); // This will give you an error
        System.out.println(a); // will show 100
        System.out.println(name); // Rahul


        // SCOPING IN LOOPS
        for(int i = 0; i<4; i++)
        {
            System.out.println(i);
        }
        System.out.println(i); // error
    }
}
