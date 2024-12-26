class Solution {
    public boolean subsetSumUtil(int ind, int target, int[] nums,int [][] dp){
        if(target==0)
        return true;
        if(ind==0)
        return nums[0]==target;
        if(dp[ind][target]!=-1)
        return dp[ind][target]==1;
        boolean notTaken=subsetSumUtil(ind-1,target,nums,dp);
        boolean taken=false;
        if(nums[ind]<=target)
        taken=subsetSumUtil(ind-1,target-nums[ind],nums,dp);
        dp[ind][target]=(notTaken || taken)? 1:0;
        return notTaken || taken;
    }
    public boolean canPartition(int[] nums) {
int n=nums.length;
int totsum=0;
for(int num:nums){
    totsum+=num;

}
if(totsum%2!=0)
return false;
int target=totsum/2;
int [][] dp=new int[n][target+1];
for(int[] row:dp)
Arrays.fill(row,-1);
return subsetSumUtil(n-1,target,nums,dp);
        
    }
}