// class Solution {
//     static int solveutil(int ind,int[] nums, int []dp){
//         if(ind<0) return 0;
//         if(ind==0) return nums[ind];
//         if(dp[ind]!=-1) return dp[ind];
//         int pick=nums[ind]+solveutil(ind-2,nums,dp);
//         int notpick=solveutil(ind-1,nums,dp);
//         return dp[ind]=Math.max(pick,notpick);
//     }

//     public int rob(int[] nums) {
//         int n=nums.length;
//         int dp[]=new int[n];
//         Arrays.fill(dp,-1);
//         return solveutil(n-1,nums,dp);
//     }
        
//     }

//tabulation approach:
 class Solution {
   static int solveutil(int n,int[] nums, int []dp){
    dp[0]=nums[0];
    for(int i=1;i<n;i++){
        int pick=nums[i];
        if(i>1)
        pick+=dp[i-2];
      int  notpick=dp[i-1];
        dp[i]=Math.max(pick,notpick);
    }
    return dp[n-1]; //After filling the dp array, the last element 
    //(dp[n - 1]) contains the maximum sum of non-adjacent elements for
    // the entire array.
   }
   public int rob( int[]nums){
    int n=nums.length;

    int dp[]=new int[n];
    Arrays.fill(dp,-1);
    return solveutil(n,nums,dp);
   }
 }