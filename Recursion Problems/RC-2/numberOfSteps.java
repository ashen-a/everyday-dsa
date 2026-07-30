public class numberOfSteps {
    public static void main(String[] args) {
        
    }
    static int steps(int n){
        return helper(n , 0);
    }

    static int helper(int n, int s){
        if(n == 0){
            return s;
        }
        
        if(n % 2 == 0){
            return helper(n / 2, s+1);
        }
        return helper(n - 1, s+1);
    }

    // Using Bit Manipulation
    static int numberOfSteps(int num){
        int steps = 0;

        while(num > 0){
            if((num & 1) == 1){
                num--;
            }else{
                num >>= 1;
            }
            steps++;

        }
        return steps;
    }
}