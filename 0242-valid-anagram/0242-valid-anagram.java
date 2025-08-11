class Solution {
    public boolean isAnagram(String s, String t) {

        
         if(s.length()!=t.length()) return false;
         int[] count=new int[26];
         for(char c:s.toCharArray()){
            count[c-'a']++;
         }
         for(char c:t.toCharArray()){
            count[c-'a']--;
         }
         for(int val:count){
            if(val!=0) return false;
         }
         return true;

        // return false;
        // char[] sArr=s.toCharArray();
        // char[] tArr=t.toCharArray();
        // Arrays.sort(sArr);
        // Arrays.sort(tArr);
        // return Arrays.equals(sArr,tArr);

    }
}