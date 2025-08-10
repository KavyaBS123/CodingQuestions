class Solution {
    public int maxSubArray(int[] nums) {
//         int maxsum=Integer.MIN_VALUE;
//         int n=nums.length;
//         for(int start =0;start<n;start++){
//             int currentsum=0;
//             for(int end=start;end<n;end++){
//                 currentsum+=nums[end];
//                 maxsum=Math.max(maxsum, currentsum);
//             }
//         }
//         return maxsum;
//     }
// }


int maxsofar=nums[0];
int maxendinghere=nums[0];
for(int i=1;i<nums.length;i++){
   maxendinghere=Math.max(nums[i],maxendinghere+nums[i]);
   maxsofar=Math.max(maxsofar,maxendinghere);
}
return maxsofar;
    }
}