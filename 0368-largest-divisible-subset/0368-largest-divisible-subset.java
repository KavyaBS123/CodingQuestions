class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
    int []dp=new int[n];
    Arrays.fill(dp,1);
    int[]hash=new int[n];
        for(int i=0;i<n;i++){
         hash[i]=i;
            for(int prev_index=0;prev_index<i;prev_index++){
                if(nums[i]%nums[prev_index]==0 && 1+ dp[prev_index]>dp[i]){
                  dp[i]=dp[prev_index]+1;
                  hash[i]=prev_index;  
                }
            }
        }
        int maxsize=-1;
        int lastindex=-1;
        for(int i=0;i<n;i++){
            if(dp[i]>maxsize){
                maxsize=dp[i];
                lastindex=i;
            }
        }
        List<Integer>result=new ArrayList<>();
        while(hash[lastindex]!=lastindex){
            result.add(nums[lastindex]);
            lastindex=hash[lastindex];
        }
        result.add(nums[lastindex]);
        Collections.reverse(result);
        return result;
        
    }
}