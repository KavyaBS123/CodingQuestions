class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int count=1;
        int max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{
                max=Math.max(count,max);
                count=1;
            }

        }
        max=Math.max(count,max);
        return max;
    }
}