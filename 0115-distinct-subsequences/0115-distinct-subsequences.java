class Solution {
    static int prime =(int)(Math.pow(10,9)+7);
    static int countutil(String s,String t,int ind1,int ind2, int[][]dp){
        if(ind2<0)
        return 1;
        if(ind1<0)
        return 0;
        if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];
        if(s.charAt(ind1)==t.charAt(ind2)){
            int leaveone=countutil(s,t,ind1-1,ind2-1,dp);
            int stay=countutil(s,t,ind1-1,ind2,dp);
            return dp[ind1][ind2]=(leaveone+stay)%prime;
        } else{
            return dp[ind1][ind2]=countutil(s,t,ind1-1,ind2,dp);
        }
    }
    public int numDistinct(String s, String t) {
       int  tt=s.length();
       int ss=t.length();
        int dp[][]=new int[tt][ss];
        for(int rows[]:dp)
        Arrays.fill(rows,-1);
        return countutil(s,t,tt-1,ss-1,dp);
    }
}