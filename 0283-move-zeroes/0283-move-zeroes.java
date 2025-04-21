class Solution {
    public void swap(int[] nums, int i, int l){
        int temp = nums[i];
        nums[i] = nums[l];
        nums[l] = temp;
    }
    
    public void moveZeroes(int[] nums) {
    int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                swap(nums,l,r);
                l++;
            }
            
        }
    }
}
