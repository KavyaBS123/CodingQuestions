class Solution {
    public void rotate(int[] nums, int k) {
        
//       int n=nums.length;
//       k%=n;
//       for(int steps=0;steps<k;steps++){
//         int last=nums[n-1];
//         for(int i=n-1;i>0;i--){
//             nums[i]=nums[i-1];
//         }
//         nums[0]=last;
//       }
//     }
// }
int n=nums.length;
k%=n;
reverse(nums,0,n-1);
reverse(nums,0,k-1);
reverse(nums,k,n-1);
    }
private void reverse(int []nums , int start , int end){
    for(int i=start,j=end;i<j;i++,j--){
int temp=nums[i];
nums[i]=nums[j];

nums[j]=temp;
    }
}
}