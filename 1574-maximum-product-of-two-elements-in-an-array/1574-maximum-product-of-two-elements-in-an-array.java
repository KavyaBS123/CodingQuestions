class Solution {
    public int maxProduct(int[] nums) {
//         int n=nums.length;
//         int max=0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 max=Math.max(max,(nums[i]-1)*(nums[j]-1));
//             }
//         }
//         return max;
//     }
// }
// int max1=0,max2=0;
// for(int num:nums){
//     if(num>max1){
//         max2=max1;
//         max1=num;
//     }
//     else if(num>max2){
//         max2=num;
//     }

// }
// return (max1-1)*(max2-1);
// }
// }

PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
for(int num:nums)
pq.add(num);
int max1=pq.poll();
int max2=pq.poll();
return (max1-1)*(max2-1);
    }
}