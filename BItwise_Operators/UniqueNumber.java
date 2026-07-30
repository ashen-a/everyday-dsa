public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 2};
        System.out.println("The unique number is: " + findUniqueNumber(arr));
    }
    public static int findUniqueNumber(int[] nums){
        int result = 0;

        // We have 32 coloums to check. Let's loop through all of time
        for(int i = 0; i < 32; i++){
            int bitCount = 0;

            for(int num : nums){

                // Inspect the bit at the current column (i)
                // If it is a 1, add it to our count.
                if(((num >> i) & 1) == 1){
                    bitCount++;
                }
            }


            // Apply the % 3 rule.
            // If the count isn't divisible by 3, our unique number has a 1 here.
            if(bitCount % 3 != 0){
                result |= (1 << i);
            }
        }
        return result;
    }
}
