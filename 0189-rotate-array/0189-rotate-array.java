// To rotate right by k:

// Reverse the entire array.
//  Example:

// [1, 2, 3, 4, 5, 6, 7] → [7, 6, 5, 4, 3, 2, 1]
// Reverse the first k elements.


// [7, 6, 5, 4, 3, 2, 1] → [5, 6, 7, 4, 3, 2, 1]
// Reverse the remaining n - k elements.


// [5, 6, 7, 4, 3, 2, 1] → [5, 6, 7, 1, 2, 3, 4]




class Solution {
    public void rotate(int[] nums, int k) {
    int l=0,r=nums.length-1;
     k=k%nums.length;
    while(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
    }
    l=0;
    r=k-1;
    while(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;

    }
    l=k;
    r=nums.length-1;
    while(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
    }

       
    }
}