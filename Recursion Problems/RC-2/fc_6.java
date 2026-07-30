public class fc_6 {
    public static void main(String[] args) {
        // Sum of digits of a number
        // 1342 = 1 + 3 + 4 + 2
        int ans = prod(123);
        System.out.println(ans);

    }
    static int prod(int n){
        if(n == 0){
            return 0; 
        }


        return (n % 10 + prod(n / 10));
    }
}
