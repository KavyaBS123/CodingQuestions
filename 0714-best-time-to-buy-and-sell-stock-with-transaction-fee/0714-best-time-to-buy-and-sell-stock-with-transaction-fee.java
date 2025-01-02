class Solution {
     

    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
      
       if(n==0){
        return 0;
       }
       int dp[][]=new int[n+1][2];
       for(int ind=n-1;ind>=0;ind--){
        for(int buy=0;buy<=1;buy++){
            int profit=0;
             if (buy == 0) { // We can buy the stock
            profit = Math.max(0 + dp[ind+1][0],
             -prices[ind] + dp[ind+1][1]);
        }

        if (buy == 1) { // We can sell the stock
            profit = Math.max(0 + dp[ind+1][1],
             prices[ind] - fee + dp[ind+1][0]);
        }

        // Store the result in dp and return it
        dp[ind][buy] = profit;
    
    }
        
       }
       return dp[0][0];
      
    }
}