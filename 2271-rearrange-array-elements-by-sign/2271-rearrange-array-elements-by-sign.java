class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int positiveindex=0,negativeindex=1;
        for(int num:nums){
            if(num>0){
                ans[positiveindex]=num;
                positiveindex+=2;
            }
            if(num<0){
                ans[negativeindex]=num;
                negativeindex+=2;
            }
        }
        return ans;
    }
}
