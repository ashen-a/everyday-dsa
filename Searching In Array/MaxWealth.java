public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumwealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // for(int[] ints : accounts){}
            int rowsum = 0;
            for (int account = 0; account < accounts[person].length; account++) 
            // for (int anInt : ints){ rowsum += anInt; }
            {
                rowsum += accounts[person][account];
            }
            if( rowsum > ans)
                ans = rowsum;
        }
        return ans;
    }
}
