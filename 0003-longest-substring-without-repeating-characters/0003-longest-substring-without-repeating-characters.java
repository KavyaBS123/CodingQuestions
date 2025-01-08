class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer>mpp=new HashMap<Character,Integer>();
        int left=0,right=0,maxlen=0;
        int n=s.length();
        while(right<n){
          
            if(mpp.containsKey(s.charAt(right))) left=Math.max(mpp.get(s.charAt(right))+1,left);
            mpp.put(s.charAt(right),right);
            maxlen=Math.max(maxlen,right-left+1);
            right++;
                }
                return maxlen;
        
    }
}