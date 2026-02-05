class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int maxend=nums[0];
        int n=nums.length;
        for(int start =1;start<n;start++){
            maxend=Math.max(nums[start],maxend+nums[start]);
            maxsum=Math.max(maxsum,maxend);
        }
        return maxsum;
    }
}
           

// int maxsofar=nums[0];
// int maxendinghere=nums[0];
// for(int i=1;i<nums.length;i++){
//    maxendinghere=Math.max(nums[i],maxendinghere+nums[i]);
//    maxsofar=Math.max(maxsofar,maxendinghere);
// }
// return maxsofar;
//     }
// }



// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxsum=Integer.MIN_VALUE;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             int currentsum=0;
//             for(int j=i;j<n;j++){
// currentsum+=nums[j];
// maxsum=Math.max(currentsum, maxsum);
//             }
//         }
//         return maxsum;
//     }
// }
