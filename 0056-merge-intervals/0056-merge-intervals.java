// 


// optimal approach
class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=0;i<intervals.length;i++){
           int curstart=intervals[i][0];
           if(curstart<=ans.get(ans.size()-1)[1]){
            ans.get(ans.size()-1)[1]=
            Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
           }
else{
    ans.add(intervals[i]);
}
    }
    int res[][]=new int[ans.size()][2];
    ans.toArray(res);
    return res;
}
}