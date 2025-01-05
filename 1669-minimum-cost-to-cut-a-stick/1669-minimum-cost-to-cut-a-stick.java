class Solution {
    public int minCost(int n, int[] cuts) {
        ArrayList<Integer> cutlist=new ArrayList<>();
        for(int cut:cuts){
            cutlist.add(cut);
        }
        cutlist.add(0);
        cutlist.add(n);
        Collections.sort(cutlist);
        int c=cuts.length;
        int[][]dp=new int[c+2][c+2];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return calculatecost(1,c,cutlist,dp);
    }
    private int calculatecost(int i, int j, ArrayList<Integer> cuts, int[][] dp){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int mini=Integer.MAX_VALUE;
        for(int ind=i;ind<=j;ind++){
            int cost=cuts.get(j+1)-cuts.get(i-1)
            +calculatecost(i,ind-1,cuts,dp)
            +calculatecost(ind+1,j,cuts,dp);
            mini=Math.min(mini,cost);
        }
        return dp[i][j]=mini;
    }
}