class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][] ahead=new int[2][k+1];
        int [] [] cur=new int[2][k+1];
        int [][][] dp=new int[n+1][2][k+1];
       for(int ind=n-1;ind>=0;ind--){
        for(int buy=0;buy<=1;buy++){
            for(int cap=1;cap<=k;cap++){
                if(buy==0){
            cur[buy][cap]=Math.max(0+ahead[0][cap],
            -prices[ind]+ahead[1][cap]);
        } else {
cur[buy][cap]=Math.max(0+ahead[1][cap],
prices[ind]+ahead[0][cap-1]);
        }
            }
     
    }
    for(int i=0;i<2;i++){
        System.arraycopy(cur[i],0,ahead[i],0,k+1);
    } 
            
        }
        return ahead[0][k];
       }
 
}