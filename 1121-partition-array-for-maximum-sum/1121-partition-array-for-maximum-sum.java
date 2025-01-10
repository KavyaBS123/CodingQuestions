class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[]dp=new int[n+1];
     for(int ind=n-1;ind>=0;ind--){
        int len=0;
            int maxi=Integer.MIN_VALUE;
        int maxans=Integer.MIN_VALUE;
        for(int j=ind;j<Math.min(ind+k,n);j++){
            len++;
            maxi=Math.max(maxi,arr[j]);
            int sum=len*maxi+dp[j+1];
            maxans=Math.max(maxans,sum);
        }
         dp[ind]=maxans;
    }
    return dp[0];
}
     
    
 
    
}