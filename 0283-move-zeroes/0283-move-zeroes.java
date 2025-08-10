class Solution {
    public void moveZeroes(int[] nums) {
      int n=nums.length;
   
    int lastnonzeroindex=0;
    for(int i=0;i<n;i++){
        if(nums[i]!=0){
            if(i!=lastnonzeroindex){
                int temp=nums[i];
                nums[i]=nums[lastnonzeroindex];
                nums[lastnonzeroindex]=temp;
            }
            lastnonzeroindex++;
        }
    }
    }
}