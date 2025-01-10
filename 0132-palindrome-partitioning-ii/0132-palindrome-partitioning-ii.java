class Solution {
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return f(0,n,s,dp)-1;
        
    }
    static int f(int i, int n, String s, int[] dp){
        if(i==n)
        return 0;
        if(dp[i]!=-1) return dp[i];
        int mincost=Integer.MAX_VALUE;
        for(int j=i;j<n;j++){
            if(ispalindrome(i,j,s)){
                int cost=1+f(j+1,n,s,dp);
                mincost=Math.min(mincost,cost);
            }
        }
        return dp[i]=mincost;
    }
    static boolean ispalindrome(int i, int j, String s)
{
    while(i<j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;
        j--;
    }
    return true;
}}