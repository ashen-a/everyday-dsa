public class Overloading {
    // FUNCTION OPVERLOADING HAPPENS AT COMPILE TIME
    public static void main(String[] args) {
        fun(67);
        fun("Ayush Das");
        
    }
    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String name){
        System.out.println(name);
    }
    
}
