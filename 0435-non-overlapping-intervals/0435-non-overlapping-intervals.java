class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int ans=0;
        int i=0;
        while(i<intervals.length){
            int end=intervals[i][1];
            i++;
            while(i<intervals.length && intervals[i][0]<end){
                i++;
                ans++;
            }
        }
        return ans;
    }
}