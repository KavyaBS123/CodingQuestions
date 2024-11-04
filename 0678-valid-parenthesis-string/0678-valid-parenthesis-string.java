class Solution {
    public boolean checkValidString(String s) {
        int min=0,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                max++;
                min++;
            } else if(ch==')'){
if(min>0){
    min--;
}
max--;
            }else{
                if(min>0){
                    min--;
                }max++;
            }
            if(max<0){
                return false;
            }
        }
        return min==0;
    }
}