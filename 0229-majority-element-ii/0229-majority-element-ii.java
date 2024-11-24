class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
int cnt1=0;
int cnt2=0;
int e1=Integer.MIN_VALUE;
int e2=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
    if(cnt1==0 && e2!=nums[i]){
        cnt1=1;
        e1=nums[i];
        
    } else if(cnt2==0 && e1!=nums[i]){
        cnt2=1;
        e2=nums[i];
    } else if(nums[i]==e1) cnt1++;
    else if(nums[i]==e2) cnt2++;
    else{
        cnt1--;
        cnt2--;
    }
}
List<Integer>ls=new ArrayList<>();
cnt1=0;
cnt2=0;
for(int i=0;i<n;i++){
    if(e1==nums[i]) cnt1++;
    if(e2==nums[i]) cnt2++;
    
}
   int mini=(int)(n/3)+1;
   if(cnt1>=mini) ls.add(e1);
   if(cnt2>=mini) ls.add(e2);
   Collections.sort(ls);
   return ls;
        
    }
}
