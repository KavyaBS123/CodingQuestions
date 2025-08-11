class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        int n=s.length();
        String rotated=s;
        for(int i=0;i<n;i++){
            rotated=rotated.substring(1)+rotated.charAt(0);
            if(rotated.equals(goal))
            return true;
        }
        return false;
        
    }
}