class Solution {
    public void swap(int [] a, int i , int boundary){
        int temp=a[i];
        a[i]=a[boundary];
        a[boundary]=temp;
    }
    public int removeElement(int[] nums, int val) {
        int boundary =nums.length-1;
        int i=0;
        while(i<=boundary){
            if(nums[i]==val){
                swap(nums,i , boundary);
                boundary-=1;

            } else{
                i+=1;
            }
        }return i;
        
    }
}