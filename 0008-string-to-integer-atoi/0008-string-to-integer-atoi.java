class Solution {
    public int myAtoi(String s) {
        
      int i=0;
      int n=s.length();
      int sign=1;
      long num=0;


      while(i<s.length() && s.charAt(i)==' '){
        i++;
      }
        if(i<n && ( s.charAt(i)=='+' || s.charAt(i)=='-')){
        if(s.charAt(i)=='-'){
            sign =-1;
        }
        i++;
      }
      while(i<n && Character.isDigit(s.charAt(i))){
        int digit=s.charAt(i)-'0';
          //char c='5'  internally it is 53 , so '5' ASCII =53 and '0' ASCII=48 so it becomes 53-48=5

        num=num*10+digit;

        //handle overflow if large numbers you get on multiply

        if(sign*num > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sign*num< Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        i++;
      }
      return (int)(sign*num);
    }
}