public class Reset_bit {
    public static void main(String[] args) {
        int num = 0b1010110;
        int n = 5; // reset the 5th digit

        int first_mask = 1 << (n - 1);
        int final_mask = ~first_mask;
        
        int ans = num & final_mask;
        System.out.println(ans);

        
    }
}
