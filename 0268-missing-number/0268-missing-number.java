class Solution {
    public int missingNumber(int[] nums) {


        // Arrays.sort(nums);
        int n=nums.length;
        int expsum=n*(n+1)/2;
        int actualsum=0;
        for(int num:nums){
             actualsum += num;
        }
        return expsum-actualsum;
    }
}
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return nums.length;
   