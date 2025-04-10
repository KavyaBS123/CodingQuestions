class Solution {
    void recurse(char[]str, int pos, List<String>result){

    
   
        if(pos==str.length)
        {
result.add(new String(str));
return;
        }
        if(Character.isLetter(str[pos])){
            if(Character.isUpperCase(str[pos])){
                str[pos]=Character.toLowerCase(str[pos]);
                recurse(str,pos+1,result);
                str[pos]=Character.toUpperCase(str[pos]);
            }
            else{
                str[pos]=Character.toUpperCase(str[pos]);
                recurse(str,pos+1,result);
                str[pos]=Character.toLowerCase(str[pos]);
            }
        }
        recurse(str,pos+1,result);
            
}
 public List<String> letterCasePermutation(String s) {
    List<String>result=new ArrayList<>();
    recurse(s.toCharArray(),0,result);
return result;
 }
}