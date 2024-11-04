class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1) return 0;
        if(nums.length==2) return 1;
        int l=1;
        int r=nums[0];
        int step=1;
        int range=nums[0];
        while(range<nums.length-1){
            for(int i=l;i<=r;i++){
                if(i>=nums.length) return ++step;
                range=Math.max(range,i+nums[i]);
            }
            step++;
            l=r;
            r=range;
        }
        return  step;
        
    }
}