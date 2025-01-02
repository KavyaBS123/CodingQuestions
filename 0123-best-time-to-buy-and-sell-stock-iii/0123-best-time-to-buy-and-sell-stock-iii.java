class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] ahead=new int[2][3];
        int [][] cur=new int[2][3];
      
       for(int ind=n-1;ind>=0;ind--){
        for(int buy=0;buy<=1;buy++){
            for(int cap=1;cap<=2;cap++){

            
               if (buy == 0) {
            cur[buy][cap] = Math.max(0 + ahead[0][cap],
                    -prices[ind] +ahead[1][cap]);
        } else if (buy == 1) {
            cur[buy][cap] = Math.max(0 + ahead[1][cap],
                    prices[ind]+ahead[0][cap-1]);
        }
       }
       }
       for(int i=0;i<2;i++){
        for(int j=1;j<3;j++){
ahead[i][j]=cur[i][j];
        }
        
       }
       }
       return ahead[0][2];
}
}
