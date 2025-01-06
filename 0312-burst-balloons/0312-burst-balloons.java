class Solution {
    private int getmaxcoins(int i, int j, int[]nums, int[][]dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int maxcoins=Integer.MIN_VALUE;
        for(int ind=i;ind<=j;ind++){
            int cost=nums[i-1]*nums[ind]*nums[j+1]
            +getmaxcoins(i,ind-1,nums,dp)
            +getmaxcoins(ind+1,j,nums,dp);
            maxcoins=Math.max(maxcoins,cost);
        }
        return dp[i][j]=maxcoins;
    }
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] extendednums=new int[n+2];
        extendednums[0]=1;
        extendednums[n+1]=1;
        for(int i=0;i<n;i++){
            extendednums[i+1]=nums[i];
        }
        int[][]dp=new int[n+2][n+2];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return getmaxcoins(1,n,extendednums,dp);
    }
}