
// MEMOIZATION APPROACH:

// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int n=triangle.size();
//         int[][]dp=new int[n][n];
//         for(int[] row:dp){
//             Arrays.fill(row,-1);
//         }
//         return minimumpathsumutil(0,0,triangle,n,dp);
//     }
//     private int minimumpathsumutil(int i, int j, List<List<Integer>> triangle, int n, int[][]dp){

    
//     if(dp[i][j]!=-1){
//         return dp[i][j];
//     }
//     if(i==n-1){
//         return triangle.get(i).get(j);
//     }
//     int down=triangle.get(i).get(j)+minimumpathsumutil(i+1,j,triangle,n,dp);
//     int diagonal=triangle.get(i).get(j)+minimumpathsumutil(i+1,j+1,triangle,n,dp);
// return dp[i][j]=Math.min(down,diagonal);
// }
// }

//TC:O(N*N)
//SC:O(N*N)

//TABULATION APPROACH:
// class Solution {
//      public int minimumTotal(List<List<Integer>> triangle) {
// int n=triangle.size();
// int dp[][]=new int[n][n];
// for(int j=0;j<n;j++){
//     dp[n-1][j]=triangle.get(n-1).get(j);
// }
// for(int i=n-2;i>=0;i--){
//     for(int j=i;j>=0;j--){
//         int down=triangle.get(i).get(j)+dp[i+1][j];
//         int diagonal=triangle.get(i).get(j)+dp[i+1][j+1];
//         dp[i][j]=Math.min(down,diagonal);
//     }
// }
// return dp[0][0];
//      }
// }

// SC:O(N*N)


//SAPCE OPETIMIZATION:
class Solution {
      public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [] front=new int[n];
        int [] cur=new int[n];
        for(int j=0;j<n;j++){
            front[j]=triangle.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down=triangle.get(i).get(j)+front[j];
                int diagonal=triangle.get(i).get(j)+front[j+1];
                cur[j]=Math.min(down,diagonal);
                            }
                            front=cur.clone();
        }
        return front[0];
      }
}
