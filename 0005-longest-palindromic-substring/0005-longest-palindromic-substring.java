class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String longest="";
        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);

                if(ispalindrome(sub) && sub.length()>longest.length()){
                    longest=sub;
                }
            }
        }
        return longest;
    }
    private boolean ispalindrome(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
            return false;
            left++;
            right--;
        }    
        return true;
        }
}