public class FastExponentiation {
    public static void main(String[] args) {
        int base = 3;
        int power = 6; // 110 in binary
        
        int ans = 1;
        
        while (power > 0) {
            // Check if the rightmost bit is 1
            if ((power & 1) == 1) {
                ans = ans * base;
            }
            
            // Square the base for the next bit position
            base = base * base;
            
            // Right shift the power to look at the next bit
            power = power >> 1;
        }
        
        System.out.println("Result: " + ans); // Outputs 729 (which is 3^6)
    }
}