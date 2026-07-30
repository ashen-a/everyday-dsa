public class EvenDigits {
    public static void main(String[] args) {
       // Find number of numbers that have even number of digits 
       int[] nums = {12, 346, 2, 6, 7896};
       System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums)
    {
        int count = 0;
        for(int num :nums){
            if(even(num))
                count++;
        }
        return count;
    }
    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberofDigits = digits(num);
        /*if(numberofDigits % 2 == 0)
            return true;
        else
            return false;*/

        return numberofDigits % 2 == 0;
    }

    static int digits2(int num){

        if(num < 0)
            num *= -1;

        return (int)(Math.log10(num)) + 1;
    }
    
    static int digits(int num){
        int count = 0;

        if(num < 0)
            num *= -1;

        
        if(num == 0)
            return 1;

        
        while(num > 0){
            count++;
            num /= 10;
        }   
        
        return count;
    }
}