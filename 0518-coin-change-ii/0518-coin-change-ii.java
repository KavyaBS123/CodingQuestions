

// class Solution {
//     public int change(int amount, int[] coins) {
//         int [] dp=new int[amount+1];
//         dp[0]=1;
//         for(int coin:coins){
//             for(int i=1;i<=amount;i++){
//                 if(coin<=i){
//                     dp[i]+=dp[i-coin];
//                 }
//             }
//         }
//       return dp[amount];
//     }
// }
// MEMOIZATION APPROACH:
// class Solution {
//     public int change(int amount, int[] coins) {
//         int n=coins.length;
//         int dp[][]=new int[n][amount+1];
//         for(int row[]:dp)
//         Arrays.fill(row,-1);
//         return countwaystomakechangeutil(coins,n-1,amount,dp);
//     }
//     static int countwaystomakechangeutil(int[] coins, int ind, int amount,int[][]dp){
//         if(ind==0){
//             if(amount%coins[0]==0)
//             return 1;
//             else
//             return 0;
//         }
//         if(dp[ind][amount]!=-1)
//         return dp[ind][amount];
//         int nottaken=countwaystomakechangeutil(coins,ind-1,amount,dp);
//         int taken=0;
//         if(coins[ind]<=amount)
//      taken=countwaystomakechangeutil(coins,ind,amount-coins[ind],dp);
//      return dp[ind][amount]=nottaken+taken;
//     }
// }
//TC:O(N*T)
//SC:O(N*T)+O(N)


//TABULATION APPROACH:
//  class Solution {
//     public int change(int amount, int[] coins) {
//         int n =coins.length;
//         int dp[][]=new int[n][amount+1];
//         for(int i=0;i<=amount;i++){
//             if(i%coins[0]==0)
//             dp[0][i]=1;
//         }
//         for(int ind=1;ind<n;ind++){
//             for(int target=0;target<=amount;target++){
//                 int nottaken=dp[ind-1][target];
//                 int taken=0;
//                 if(coins[ind]<=target)
//                 taken=dp[ind][target-coins[ind]];
//                 dp[ind][target]=nottaken+taken;
//             }
//         }
//         return dp[n-1][amount];
//     }
//  }


//SPACE OPTIMIZATION:
 class Solution {
     public int change(int amount, int[] coins) {
        int n=coins.length;
        int [] prev=new int[amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)
            prev[i]=1;

        }
        for(int ind=1;ind<n;ind++){
            int [] cur=new int[amount+1];
            for(int target=0;target<=amount;target++){
                int nottaken=prev[target];
                int taken=0;
                if(coins[ind]<=target)
                taken=cur[target-coins[ind]];
                cur[target]=nottaken+taken;
            }
            prev=cur;
        }
        return prev[amount];
     }
 }