class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length; ){
            char c=chars[i];
            int count=0;
            for(int j=i;j<chars.length && chars[j]==c;j++){
                count++;
            }
            sb.append(c);
            if(count>1) sb.append(count);
i+=count;
        }
        for(int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }
        return sb.length();

    }
}