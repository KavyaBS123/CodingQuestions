class Solution {
     static int getans(int[] Arr, int ind, int buy, int n, int fee, int[][] dp) {
        // Base case
        if (ind == n) {
            return 0;
        }

        // If the result is already calculated, return it
        if (dp[ind][buy] != -1) {
            return dp[ind][buy];
        }

        int profit = 0;

        if (buy == 0) { // We can buy the stock
            profit = Math.max(0 + getans(Arr, ind + 1, 0, n, fee, dp), -Arr[ind] + getans(Arr, ind + 1, 1, n, fee, dp));
        }

        if (buy == 1) { // We can sell the stock
            profit = Math.max(0 + getans(Arr, ind + 1, 1, n, fee, dp), Arr[ind] - fee + getans(Arr, ind + 1, 0, n, fee, dp));
        }

        // Store the result in dp and return it
        dp[ind][buy] = profit;
        return profit;
    }

    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
       int dp[][]=new int[n][2];
       for(int row[]:dp){
        Arrays.fill(row,-1);
       } 
       if(n==0){
        return 0;
       }
       int ans=getans(prices,0,0,n,fee,dp);
       return ans;
    }
}