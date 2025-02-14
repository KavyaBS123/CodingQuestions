class Solution {
     public int coinChange(int[] coins, int amount) {
   int n=coins.length;
        int [][] dp=new int [n][amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)
            dp[0][i]=i/coins[0];
            else
            dp[0][i]=(int) Math.pow(10,9);
        }
        // if(ind==0){
        //     if(amount%coins[0]==0)
        //     return amount/coins[0];
        //     else
        //     return (int) Math.pow(10,9);
        // }
        // if(dp[ind][amount]!=-1)
        // return dp[ind][amount];
        for(int ind=1;ind<n;ind++){
            for(int target=0;target<=amount;target++){
        int notTaken=0+dp[ind-1][target];
        int taken=(int) Math.pow(10,9);
        if(coins[ind]<=target)
        taken=1+dp[ind][target-coins[ind]];
     dp[ind][target]=Math.min(notTaken,taken);

    }
   
        
        }
        int ans=dp[n-1][amount];
        if(ans>=(int)Math.pow(10,9))
        return -1;
        return ans;
    }
}