class Solution {
    static int solveutil(int ind,int[] nums, int []dp){
        if(ind<0) return 0;
        if(ind==0) return nums[ind];
        if(dp[ind]!=-1) return dp[ind];
        int pick=nums[ind]+solveutil(ind-2,nums,dp);
        int notpick=solveutil(ind-1,nums,dp);
        return dp[ind]=Math.max(pick,notpick);
    }

    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solveutil(n-1,nums,dp);
    }
        
    }
