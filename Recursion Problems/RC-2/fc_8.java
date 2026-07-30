public class fc_8 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        // fun(n--);
        // Concept : n--
        // This will pass the value of n first then subtract
        // --n 
        // This will subtract first then pass the value of n
        // Therefore
        fun(--n);
    }
}
