class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
       int l=0;
       while(l<=n){
        char tmp=s[l];
       s[l]=s[n];
       s[n]=tmp;
       l++;
       n--;
       
        }
    }
}