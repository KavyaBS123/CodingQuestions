class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return new int[0][0];
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        ArrayList<int[]>ans=new  ArrayList<>();
      int [] currentInterval=intervals[0];
      ans.add(currentInterval);
      for(int i=1;i<intervals.length;i++){
        int[] interval=intervals[i];
        if(currentInterval[1]>=interval[0]){
            currentInterval[1]=Math.max(currentInterval[1],interval[1]);
        } else{
            currentInterval=interval;
            ans.add(currentInterval);
        }
      }
      return ans.toArray(new int[ans.size()][]);
    }
}