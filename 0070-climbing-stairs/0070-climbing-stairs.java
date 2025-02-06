// class Solution {
//     public int climbStairs(int n) {
//         // optimal
//         int a=1;
//         int b=1;
//         int c;
//         for(int i=0;i<n-1;i++){
//             c=a+b;
//             a=b;
//             b=c;
//         }
//         return b;
//     }
// }
// tabulation
// class Solution {
//     public int climbStairs(int n) {
//         int [] dp=new int[n+1];
//         dp[0]=1;
//         dp[1]=1;
//         for(int i=2;i<n+1;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//     }
// }

//memoization
// class Solution {
//     public int climbStairs(int n) {
//         int[] memo=new int[n+1];
//         Arrays.fill(memo,-1);
//         return climbstairs(n-1,memo)+climbstairs(n-2,memo);
//     }
//     private int climbstairs(int n, int[] memo){
// if(n<0) return 0;
// if(n==0 || n==1){
//     memo[n]=1;
//     return memo[n];

// }
// if(memo[n]!=-1) return memo[n];
// memo[n]=climbstairs(n-1,memo)+climbstairs(n-2,memo);
// return memo[n];
//     }



// memoization approach
class Solution {
     public int climbStairs(int n) {
        int memo[]= new int[n+1];
        Arrays.fill(memo,-1);
        return climbstaris(n-1,memo)+climbstaris(n-2,memo);
     }
private int climbstaris(int n, int memo[]){
    if(n<0) return 0;
    if(n==0 || n==1 ){

    memo[n]=1;
    return memo[n];
}
if(memo[n]!=-1) return memo[n];
memo[n]=climbstaris(n-1,memo)+climbstaris(n-2,memo);
return memo[n];
}
}