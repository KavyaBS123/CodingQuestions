class Solution {
  
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] extendednums=new int[n+2];
        extendednums[0]=1;
        extendednums[n+1]=1;
        for(int i=0;i<n;i++){
            extendednums[i+1]=nums[i];
        }
        int[][]dp=new int[n+2][n+2];
      for(int i=n;i>=1;i--){
        for(int j=i;j<=n;j++){
            int maxicoins=Integer.MIN_VALUE;
            for(int ind=i;ind<=j;ind++){
            int cost=extendednums[i-1]*extendednums[ind]*extendednums[j+1]
            +dp[i][ind-1]
            +dp[ind+1][j];
            maxicoins=Math.max(maxicoins,cost);
        }
         dp[i][j]=maxicoins;
            }
        }
        return dp[1][n];
      }
        
    
}