class Solution {
    // public boolean subsetSumUtil(int ind, int target, int[] nums,int [][] dp){
    //     if(target==0)
    //     return true;
    //     if(ind==0)
    //     return nums[0]==target;
    //     if(dp[ind][target]!=-1)
    //     return dp[ind][target]==1;
    //     boolean notTaken=subsetSumUtil(ind-1,target,nums,dp);
    //     boolean taken=false;
    //     if(nums[ind]<=target)
    //     taken=subsetSumUtil(ind-1,target-nums[ind],nums,dp);
    //     dp[ind][target]=(notTaken || taken)? 1:0;
    //     return notTaken || taken;
    // }
    public boolean canPartition(int[] nums) {
 int n=nums.length;



// // tabulation approach 
// int totsum=0;
// for(int i=0;i<n;i++){
//     totsum+=nums[i];

// }
// if(totsum%2==1)
// return false;

//     int k=totsum/2;
//     boolean dp[][]=new boolean [n][k+1];
//     for(int i=0;i<n;i++){
//         dp[i][0]=true;
//     }
//     if(nums[0]<=k){
//         dp[0][nums[0]]=true;
//     }
//     for(int ind=1;ind<n;ind++){
//         for(int target=1;target<=k;target++){
//             boolean notTaken = dp[ind - 1][target];
//             boolean taken=false;
//             if(nums[ind]<=target){
//                 taken=dp[ind-1][target-nums[ind]];

//             }
        
//             dp[ind][target]=notTaken||taken;
//         }
//     }
//     return dp[n-1][k];
// }
//     }
// space optimised
int totsum=0;
for(int i=0;i<n;i++){
    totsum+=nums[i];
}
if(totsum%2==1)
return false;

    int k=totsum/2;
    boolean prev[] = new boolean[k+1];
    prev[0]=true;
    if
    (nums[0]<=k){
        prev[nums[0]]=true;
    }
    for(int ind=1;ind<n;ind++){
        boolean cur[]=new boolean [k+1];
        cur[0]=true;
        for(int target=1;target<=k;target++){
            boolean notTaken=prev[target];
            boolean taken=false;
            if(nums[ind]<=target){
                taken=prev[target-nums[ind]];
            }
            cur[target]=notTaken || taken;
        }
        prev=cur;
    }
    return prev[k];
}
    }