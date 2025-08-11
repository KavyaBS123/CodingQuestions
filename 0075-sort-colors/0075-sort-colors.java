class Solution {
    public void sortColors(int[] nums) {

        //Dutch National flag algo:

        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
        private void swap(int [] nums , int i , int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
//         int count0=0,count1=0,count2=0;
//         for(int num:nums){
//             if(num==0) count0++;
//            else if(num==1) count1++;
//             else count2++;

//         }
//         int index=0;
//         while(count0-->0) nums[index++]=0;
//         while(count1-->0) nums[index++]=1;
//         while(count2-->0) nums[index++]=2;
//     }
// }



