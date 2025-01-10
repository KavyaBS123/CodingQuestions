class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return f(0,arr,k,dp);
    }
    static int f(int ind, int[]arr,int k,int []dp){
        int n=arr.length;
        if(ind==n) return 0;
       
        if(dp[ind]!=-1) return dp[ind];
        int len=0;
        int maxi=Integer.MIN_VALUE;
        int maxans=Integer.MIN_VALUE;
        for(int j=ind;j<Math.min(ind+k,n);j++){
            len++;
            maxi=Math.max(maxi,arr[j]);
            int sum=len*maxi+f(j+1,arr,k,dp);
            maxans=Math.max(maxans,sum);
        }
        return dp[ind]=maxans;
    }
}