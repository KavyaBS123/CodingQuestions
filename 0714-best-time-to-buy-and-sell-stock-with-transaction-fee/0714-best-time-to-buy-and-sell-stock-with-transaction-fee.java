class Solution {
     

    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
      
       if(n==0){
        return 0;
       }
       int ahead[]=new int[2];
       int cur[]=new int[2];
       ahead[0]=ahead[1]=0;
       
            int profit=0;
       
       for(int ind=n-1;ind>=0;ind--){
        for(int buy=0;buy<=1;buy++){
            
             if (buy == 0) { // We can buy the stock
            profit = Math.max(0 + ahead[0],
             -prices[ind] + ahead[1]);
        }

        if (buy == 1) { // We can sell the stock
            profit = Math.max(0 + ahead[1],
             prices[ind] - fee + ahead[0]);
        }

        // Store the result in dp and return it
        cur[buy] = profit;
    
    }
    ahead=(int[])(cur.clone());
        
       }
       return cur[0];
      
    }
}