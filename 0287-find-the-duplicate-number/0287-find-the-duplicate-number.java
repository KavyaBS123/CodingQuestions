class Solution {
    public int findDuplicate(int[] nums) {
     int slow=nums[0];
     int fast=nums[0];
     for(;;){
        slow=nums[slow];
        fast=nums[nums[fast]];
        if(slow==fast)
        break;
     }   
     slow=nums[0];
     for(;;){
     if(slow==fast)
     return slow;
     slow=nums[slow];
     fast=nums[fast];
    }
}
}