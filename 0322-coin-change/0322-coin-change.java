class Solution {
    static int minimumelementsutil(int [] coins,int ind, int amount, int[][] dp){
        if(ind==0){
            if(amount%coins[0]==0)
            return amount/coins[0];
            else
            return (int) Math.pow(10,9);
        }
        if(dp[ind][amount]!=-1)
        return dp[ind][amount];
        int notTaken=0+minimumelementsutil(coins,ind-1,amount,dp);
        int taken=(int) Math.pow(10,9);
        if(coins[ind]<=amount)
        taken=1+minimumelementsutil(coins,ind, amount-coins[ind],dp);
        return dp[ind][amount]=Math.min(notTaken,taken);

    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int [][] dp=new int [n][amount+1];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        int ans=minimumelementsutil(coins,n-1,amount,dp);
        if(ans>=(int) Math.pow(10,9))
        return -1;
        return ans;
    }
}