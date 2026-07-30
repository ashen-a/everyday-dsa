public class Reverse {
    public static void main(String[] args) {
        int rev = 0;
        int num = 28479;

        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }



        System.out.println(rev);
    }
    
}
