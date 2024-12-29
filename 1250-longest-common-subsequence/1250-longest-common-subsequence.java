class Solution {
   
    public int longestCommonSubsequence(String text1, String text2) {
        // Tabulation tech:
        int n=text1.length();
        int m=text2.length();
      int prev[]=new int[m+1];
      int cur[]=new int[m+1];

          
            for(int ind1=1;ind1<=n;ind1++){
                for(int ind2=1;ind2<=m;ind2++){
                if(text1.charAt(ind1-1)==text2.charAt(ind2-1))
                cur[ind2]=1+prev[ind2-1];
                else
                cur[ind2]=Math.max(prev[ind2],cur[ind2-1]);
                }
            prev =(int[])(cur.clone());
            
            }
            return prev[m];
        }
        
    }

