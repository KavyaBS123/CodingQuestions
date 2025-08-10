class Solution {
    public int maxProduct(int[] nums) {
        int maxsofar=nums[0];
        int minsofar=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int tempmax=maxsofar;
            maxsofar=Math.max(current,Math.max(current*maxsofar,current*minsofar));
            minsofar=Math.min(current,Math.min(current*tempmax, current*minsofar));
            result=Math.max(result,maxsofar);
        }
        return result;
    }
}