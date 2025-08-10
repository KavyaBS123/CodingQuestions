class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numset=new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }
        int longest=0;
        for(int num:numset){
            if(!numset.contains(num-1)){
                int currentnum=num;
                int count=1;
                while(numset.contains(currentnum+1)){
                    currentnum++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
//         int longest=0;
//         for(int num:nums){
//             int currentnum=num;
//             int count=1;
//             while(contains(nums,currentnum+1)){
//                 currentnum++;
//                 count++;
//             }
//             longest=Math.max(longest,count);
//         }
//         return longest;
//     }
//    private boolean contains(int [] nums , int target){
//     for(int num:nums){
//         if(num==target)
//         return true;
//     }
//     return false;
//    }
// }